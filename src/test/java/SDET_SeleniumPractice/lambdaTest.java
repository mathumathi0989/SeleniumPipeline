package SDET_SeleniumPractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lambdaTest {

	
	private WebDriver driver;
	
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	  }
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void lambdaTest() {

	    driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
	
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//a[@class=\"icon-left both nav-link dropdown-toggle\"]//span[contains(text(),' My account')]")).click();
	

	    driver.findElement(By.id("input-email")).click();
	
	    driver.findElement(By.id("input-email")).sendKeys("testmathu@gmail.com");
	 
	    driver.findElement(By.id("input-password")).click();
	 
	    driver.findElement(By.id("input-password")).sendKeys("testmathu");
	  
	    driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
	   
	    driver.findElement(By.cssSelector(".nav-item:nth-child(1) .info:nth-child(1) > .title")).click();

	    driver.findElement(By.name("search")).click();
	   
	    driver.findElement(By.name("search")).sendKeys("ipod touch");
	
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	   
	    driver.findElement(By.cssSelector(".product-layout:nth-child(2) .text-ellipsis-2")).click();

	    driver.findElement(By.cssSelector(".h3")).click();
	   
	    Assert.assertEquals(driver.findElement(By.cssSelector(".h3")).getText(), "iPod Touch");
	  
	    driver.findElement(By.id("entry_216830")).click();
	
	    Assert.assertEquals(driver.findElement(By.cssSelector(".price-new")).getText(), "$160.00");
	
	   // driver.findElement(By.cssSelector("#entry_216842 > .text")).click();
	    driver.findElement(By.xpath("//div[@id=\"entry_216842\"]/button[@title=\"Add to Cart\"]")).click();
	   // driver.findElement(By.cssSelector(".d-flex > p")).click();
	
	  //  driver.findElement(By.cssSelector("#entry_217825 svg")).click();
	   
	    driver.findElement(By.linkText("Checkout")).click();
	   
	    driver.findElement(By.cssSelector(".custom-control:nth-child(6) > .custom-control-label")).click();
	   
	    driver.findElement(By.id("button-save")).click();
	  
	    driver.findElement(By.id("button-confirm")).click();
	
	   // driver.findElement(By.cssSelector(".page-title")).click();
	   
	    Assert.assertEquals(driver.findElement(By.cssSelector(".page-title")).getText(), "Your order has been placed!");
	   
	    driver.findElement(By.linkText("Continue")).click();
	 
	    driver.close();
	    
	  }
	
}
