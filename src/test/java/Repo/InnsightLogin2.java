package Repo;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InnsightLogin2 {

	public static WebDriver driver;

	@Test
	
	public void INNSIGHTLogin2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://192.168.2.193:8081/innsight/login_validateCredential");
		TimeUnit.SECONDS.sleep(15);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("input.textbox")).sendKeys("pravesh");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Pravesh@3210#");
		driver.findElement(By.cssSelector("input.loginbtn")).click();
		
		System.out.println("Click on Collection");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"))).build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"));
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", collection);
		collection.click();
		
       Set<String>	mulwindow	= driver.getWindowHandles();
       ArrayList<String>  newwindow = new ArrayList<> (mulwindow);
       driver.switchTo().window(newwindow.get(1));
		
		
		
	}

	@BeforeTest

	public void beforeTest() {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		c.setExperimentalOption("useAutomationExtension", false);
		c.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));  
		driver = new ChromeDriver(c);
        
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Welcome to INNSIGHT");

	}
}
