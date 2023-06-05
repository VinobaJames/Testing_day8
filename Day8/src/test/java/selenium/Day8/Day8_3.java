package selenium.Day8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_3 {
	WebDriver driver;
	  @Test(priority = 1)
	  public void T01() {
		  
		  WebElement text_field = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		  WebElement submit_btn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		  
		  
		  text_field.sendKeys("401");
		  submit_btn.click();
		  Alert a1 = driver.switchTo().alert();
		  a1.dismiss();
		  
		  text_field.clear();
		  
		  text_field.sendKeys("402");
		  submit_btn.click();
		  Alert a2 = driver.switchTo().alert();
		  a2.accept();
		  

		  Alert a3 = driver.switchTo().alert();
		  String message = a3.getText();
		  System.out.println(message);
		  a3.accept();
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		 // driver.close();
	  
	  }

}