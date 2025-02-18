package SDET_SeleniumPractice;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class HandlingAuthPopupSelenium4 {

	
	
public static void main(String[] args) throws Exception {
	String sourcePath = "/Users/mathumathibalakrishnan/Downloads/ExcelA.xlsx";  // Change this
    String targetPath = "/Users/mathumathibalakrishnan/Downloads/ExcelB.xlsx";  // Change this

    FileInputStream sourceFile = new FileInputStream(new File(sourcePath));
    FileInputStream targetFile = new FileInputStream(new File(targetPath));

    Workbook sourceWorkbook = new XSSFWorkbook(sourceFile);
    Workbook targetWorkbook = new XSSFWorkbook(targetFile);

    Sheet sourceSheet = sourceWorkbook.getSheetAt(0); // Change index if needed
    Sheet targetSheet = targetWorkbook.getSheetAt(0); // Change index if needed

    int columnIndex = 1; // Update to your actual date column index

    for (Row sourceRow : sourceSheet) {
        int rowNum = sourceRow.getRowNum();
        Cell sourceCell = sourceRow.getCell(columnIndex);

        if (sourceCell != null && sourceCell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(sourceCell)) {
            Row targetRow = targetSheet.getRow(rowNum);
            if (targetRow == null) {
                targetRow = targetSheet.createRow(rowNum);
            }

            Cell targetCell = targetRow.createCell(columnIndex);
            targetCell.setCellValue(sourceCell.getDateCellValue());

            // Apply custom date format DD-MMM-YY
            CellStyle style = targetWorkbook.createCellStyle();
            CreationHelper createHelper = targetWorkbook.getCreationHelper();
            style.setDataFormat(createHelper.createDataFormat().getFormat("DD-MMM-YY"));
            targetCell.setCellStyle(style);
        }
    }

    sourceFile.close();
    targetFile.close();

    FileOutputStream outputStream = new FileOutputStream(targetPath);
    targetWorkbook.write(outputStream);
    outputStream.close();

    sourceWorkbook.close();
    targetWorkbook.close();

    System.out.println("Date column copied with format DD-MMM-YY preserved!");
}
	
	
	
	//https://the-internet.herokuapp.com/basic_auth
	
	//https://www.lambdatest.com/blog/handling-login-popup-in-selenium-webdriver-using-java/#:~:text=To%20handle%20the%20basic%20authentication,with%20the%20web%20page's%20URL.&text=You%20enter%20the%20username%20as,URL%2C%20and%20then%20log%20in.
	
	//A list of no is available in table how to find the duplicate number?
	
	
}
