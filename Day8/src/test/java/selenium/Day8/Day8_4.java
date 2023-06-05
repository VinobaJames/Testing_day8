package selenium.Day8;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_4 {
	WebDriver driver;

	@Test(priority = 1)
	public void T01() {
		
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"source\"]"));
		From.sendKeys("Coimbatore");
		
		
		WebElement To = driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		To.sendKeys("Chennai");

		WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '04/10/2023')", datepick);
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		// driver.close();
	}
	}

