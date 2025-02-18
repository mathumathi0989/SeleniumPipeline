package SDET_SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tutorialsNinjaTest {

	private WebDriver driver;
	  JavascriptExecutor js;
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	  }
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void aatutorialsNinja() {
	
	    driver.get("https://tutorialsninja.com/demo/index.php");

	    driver.manage().window().maximize();
	   
	    driver.findElement(By.linkText("MP3 Players")).click();
	    
	    driver.findElement(By.linkText("Show AllMP3 Players")).click();
	 
	    driver.findElement(By.linkText("iPod Touch")).click();
	  
	    driver.findElement(By.cssSelector(".col-sm-4:nth-child(2)")).click();
	   
	    Assert.assertEquals(driver.findElement(By.cssSelector("h1:nth-child(2)")).getText(), "iPod Touch");
	   
	    driver.findElement(By.cssSelector("h2:nth-child(1)")).click();
	   
	    Assert.assertEquals(driver.findElement(By.cssSelector("h2:nth-child(1)")).getText(), "$122.00");
	   
	    driver.findElement(By.id("button-cart")).click();
	   
	    js.executeScript("window.scrollTo(0,50.5)");
	   
	    Assert.assertEquals(driver.findElement(By.id("cart-total")).getText(), "1 item(s) - $122.00");
	 
	    driver.findElement(By.id("cart-total")).click();
	
	    driver.findElement(By.cssSelector("a:nth-child(1) > strong")).click();
	  
	    driver.findElement(By.linkText("iPod Touch")).click();
	   
	    driver.findElement(By.id("cart-total")).click();
	   
	    driver.findElement(By.cssSelector("a:nth-child(1) > strong")).click();
	   
	    driver.findElement(By.cssSelector(".pull-right > .btn")).click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.id("input-email")).click();
	   
	    driver.findElement(By.id("input-email")).sendKeys("testmathu@gmail.com");
	 
	    driver.findElement(By.id("input-password")).sendKeys("testmathu");
	  
	    driver.findElement(By.id("button-login")).click();
	
	    driver.findElement(By.cssSelector(".panel:nth-child(1) .panel-title")).click();
	  
	    driver.findElement(By.cssSelector(".panel:nth-child(1) .panel-title")).click();
	
	    driver.findElement(By.cssSelector(".panel:nth-child(1) .panel-title")).click();
	   
	    driver.findElement(By.id("button-payment-address")).click();

	    driver.findElement(By.id("button-shipping-address")).click();
	
	    driver.findElement(By.id("button-shipping-method")).click();

	    driver.findElement(By.name("agree")).click();
	   
	    driver.findElement(By.id("button-payment-method")).click();
	   
	    driver.findElement(By.id("button-confirm")).click();
	   
	    {
	      WebElement element = driver.findElement(By.cssSelector("#content > h1"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	 
	    {
	      WebElement element = driver.findElement(By.cssSelector("#content > h1"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	  
	    {
	      WebElement element = driver.findElement(By.cssSelector("#content > h1"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	
	    driver.findElement(By.cssSelector("#content > h1")).click();
	
	    driver.findElement(By.cssSelector("#content > h1")).click();

	    Assert.assertEquals(driver.findElement(By.cssSelector("#content > h1")).getText(), "Your order has been placed!");
	  
	    driver.findElement(By.cssSelector("p:nth-child(2)")).click();
	
	    driver.findElement(By.cssSelector("p:nth-child(2)")).click();
	  
	    Assert.assertEquals(driver.findElement(By.cssSelector("p:nth-child(2)")).getText(), "Your order has been successfully processed!");
	   
	 
	 
	    driver.close();
	  }
	
	
	
}
