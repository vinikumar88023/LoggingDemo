package Logg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	
public static void main(String[] args) {
	
	System.out.println("This is main method");
	Logger log = LogManager.getLogger(login.class);
	log.debug("code break we have to work for the code");
}

@Test
void display() {
	Logger log = (Logger) LogManager.getLogger(login.class);
	log.error("Error in code");
	WebDriver driver = null;
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.get("https://www.guru99.com/selenium-tutorial.html");
	driver.manage().window().maximize();
}
}
