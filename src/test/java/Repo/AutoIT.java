package Repo;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AutoIT {
	public static WebDriver driver;
	@Test
	public void Autoit() throws InterruptedException, IOException {
		
		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions options = new ChromeOptions();
		options.merge(DC);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));  
		driver = new ChromeDriver(options);
        
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	    driver.get("https://pravesh256@gmail.com:Innefu@123@login.naukri.com/nLogin/Login.php");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#usernameField")).clear();
		driver.findElement(By.cssSelector("input#usernameField")).sendKeys("pravesh256@gmail.com");
		driver.findElement(By.cssSelector("input#passwordField")).clear();
		driver.findElement(By.cssSelector("input#passwordField")).sendKeys("Innefu@123");
		driver.findElement(By.cssSelector("input#passwordField")).sendKeys(Keys.ENTER);
		options.addArguments("--no-sandbox");
		driver.switchTo().alert().dismiss();
	
		Actions Act = new Actions(driver);
		Act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"))).build().perform();
		
	
		

		

		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.cssSelector("input#attachCV")).click();
		 * 
		 * Thread.sleep(13000);
		 * Runtime.getRuntime().exec("D:\\selenium\\cucumber\\AutoIT\\ResumeUpload.exe")
		 * ; Thread.sleep(10000);
		 */
		
	}
	
	
	}


