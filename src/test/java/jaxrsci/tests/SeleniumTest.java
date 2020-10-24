package jaxrsci.tests;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	/*
	private WebDriver driver;
	
	@Test
	public void chromeTest() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		try {
			driver.get("http://localhost:8080/jaxrsci/");
			synchronized (driver) {
				driver.wait(2000);
			}
			driver.findElement(By.id("post")).click();
			synchronized (driver) {
				driver.wait(2000);
			}
		} finally {
			driver.quit();
		}
	
	}
	
	@Test
	public void firefoxTest() throws InterruptedException{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		try {
			driver.get("http://localhost:8080/jaxrsci/");
			synchronized (driver) {
				driver.wait(2000);
			}
			driver.findElement(By.id("post")).click();
			synchronized (driver) {
				driver.wait(2000);
			}
		} finally {
			driver.quit();
		}
	
	}
	
	*/

}



