package selenium.Day8;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_5 {
		WebDriver driver;
	  @Test(priority = 1)
	  public void T01() {

		  
		  driver= new EdgeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("apple");
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		  String wid1 = driver.getWindowHandle();
		  String t1 = driver.getTitle();
		  System.out.println(wid1 +" "+ t1);
		  
		  driver= new EdgeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		  String wid2 = driver.getWindowHandle();
		  String t2 = driver.getTitle();
		  System.out.println(wid2 +" "+ t2);
		  
		  driver= new EdgeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Orange");
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		  String wid3 = driver.getWindowHandle();
		  String t3 = driver.getTitle();
		  System.out.println(wid3 +" "+ t3);
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();


	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		 // driver.close();
	  
	  }
}