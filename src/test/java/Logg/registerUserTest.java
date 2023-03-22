package Logg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registerUserTest {
	@Test
	void display(){
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		Logger log = (Logger) LogManager.getLogger(registerUserTest.class);
		driver.get("https://trytestingthis.netlify.app/");
		log.fatal("Browser open : https://trytestingthis.netlify.app/");
		
		driver.findElement(By.id("fname")).sendKeys("Vinit");
		log.warn("User enter the name Vinit ");
		
		driver.findElement(By.id("lname")).sendKeys("Kumar");
		log.info("User add the last name");
		
		driver.findElement(By.xpath("//*[text() = ' Submit']")).click();
		log.error("User successfully login");
	}

}
