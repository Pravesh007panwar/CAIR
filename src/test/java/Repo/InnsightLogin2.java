package Repo;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;
import CAIRObjectRepository.LoginPage;

import org.testng.annotations.BeforeTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InnsightLogin2 {

	public static WebDriver driver;

	@Test

	public void INNSIGHTLogin2() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		driver.get(login.loginurl());
		login.setusername().sendKeys(login.username());
		login.setPassword().sendKeys(login.password());
		login.clickLogin().sendKeys(Keys.ENTER);

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(10000);
		Actions a = new Actions(driver);
		a.moveToElement(hp.Collections()).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				hp.Collections());
		hp.Collections().click();
		Thread.sleep(5000);

		Set<String> mulwindow = driver.getWindowHandles();
		ArrayList<String> newwindow = new ArrayList<>(mulwindow);
		driver.switchTo().window(newwindow.get(1));

	}

	@BeforeTest

	public void beforeTest() {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\driver\\chromedriver.exe");
		c.setExperimentalOption("useAutomationExtension", false);
		c.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		c.addArguments("--start-maximized");
		c.addArguments("--disable-web-security");
		c.addArguments("--no-proxy-server");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		c.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(c);

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		System.out.println("Welcome to INNSIGHT");

	}
}
