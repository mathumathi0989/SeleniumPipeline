package SDET_SeleniumPractice;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sauceDemoTest {

	
	private WebDriver driver;

	  
	  @BeforeMethod
	@BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();

	  }
	  @AfterMethod
	@AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void saucedemoTest() {

	    driver.get("https://www.saucedemo.com/v1/index.html");
	
	    driver.manage().window().maximize();
	 
	    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
	   
	    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
	  
	    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
	   
	    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
	    
	    driver.findElement(By.id("login-button")).click();
	    
	    driver.findElement(By.cssSelector("#item_1_title_link > .inventory_item_name")).click();
	 
	    driver.findElement(By.cssSelector(".inventory_details_name")).click();
	   
	  
	    driver.findElement(By.cssSelector(".inventory_details_name")).click();
	   
	    driver.findElement(By.cssSelector(".inventory_details_name")).click();
	    
	    String title = driver.findElement(By.cssSelector(".inventory_details_name")).getText();
	    AssertJUnit.assertEquals(title, "Sauce Labs Bolt T-Shirt");
	 
	    driver.findElement(By.xpath("//*[@class='inventory_details_price']")).click();
	    
	    String price = driver.findElement(By.xpath("//*[@class='inventory_details_price']")).getText();
	    AssertJUnit.assertEquals(price, "$15.99");
	    
	    driver.findElement(By.cssSelector(".btn_primary")).click();
	
	    String cartQty = driver.findElement(By.cssSelector(".fa-layers-counter")).getText();
	    AssertJUnit.assertEquals(cartQty, "1");
	    
	
	    driver.findElement(By.cssSelector("path")).click();
	   
	    AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".inventory_item_name")).getText(), "Sauce Labs Bolt T-Shirt");
	    
	    AssertJUnit.assertEquals(driver.findElement(By.xpath("//*[@class='inventory_details_price']")),"15.99");
	    

	    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
	  
	    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("mathu");
	  
	    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).click();
	 
	    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("mathi");
	
	    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
	 
	    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("23232");
	    
	    driver.findElement(By.cssSelector(".btn_primary")).click();
	  
	    AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".inventory_item_name")).getText(),"Sauce Labs Bolt T-Shirt");
	    
	    AssertJUnit.assertEquals(driver.findElement(By.xpath("//*[@class='inventory_details_price']")).getText(),"$15.99");
	    
	    driver.findElement(By.linkText("FINISH")).click();
	
	    driver.findElement(By.cssSelector(".complete-header")).click();
	  
	    AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".complete-header")).getText(),"THANK YOU FOR YOUR ORDER");
	  
	    driver.findElement(By.cssSelector(".complete-text")).click();
	   
	    AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".complete-text")).getText(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	    
	  }
	}

	
	

