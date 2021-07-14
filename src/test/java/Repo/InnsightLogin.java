package Repo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
@Listeners(Repo.listners.class)
public class InnsightLogin {

	public static WebDriver driver;

	@Test
	@Parameters({ "URL", "username", "password" })
	public void INNSIGHTLogin(String URL, String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		TimeUnit.SECONDS.sleep(15);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("input.textbox")).sendKeys(username);
		driver.findElement(By.cssSelector("input.password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.loginbtn")).click();
		
	}

	@BeforeTest

	public void beforeTest() {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// local browser handling.
		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Welcome to INNSIGHT");

	}
}
