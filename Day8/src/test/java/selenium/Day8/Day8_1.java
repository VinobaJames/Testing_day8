package selenium.Day8;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_1{
	WebDriver driver;
	  @Test
	  public void T01() {

		  // switch frames
		  driver.switchTo().frame(0);
		  
		  
		  //Source Element Object
		  WebElement sourceObj = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		  //Source Element Object
		  WebElement destinationObj = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		  
		  
		  //Actions
		  Actions drag = new Actions(driver);
		  
		  //Executing Drag & Drop
		  drag.clickAndHold(sourceObj).release(destinationObj).build().perform();
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		 // driver.close();
	  
	  }


}