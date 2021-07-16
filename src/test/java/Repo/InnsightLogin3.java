package Repo;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CAIRObjectRepository.LoginPage;

public class InnsightLogin3 {
	public static WebDriver driver;

	@Test
	public void InnsightLogin() {

		driver.get("http://192.168.2.193:8081/innsight/login_validateCredential");
		LoginPage login = new LoginPage(driver);
		login.setusername().sendKeys("pravesh");
		login.setPassword().sendKeys("Pravesh@3210#");
		login.clickLogin().sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void beforeTest() {
		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		c.setExperimentalOption("useAutomationExtension", false);
		c.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		driver = new ChromeDriver(c);

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Welcome to INNSIGHT");

	}
}
