package BigdataRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test131accesstoauditlogs extends InnsightLogin {
	@AfterClass
	
	public void Administrative() throws InterruptedException, AWTException {

		driver.findElement(By.id("divSettingId")).click();
		
		WebElement userlog = driver.findElement(By.id("UserLogAddPanel"));
		userlog.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", userlog);
		
		userlog.click();
	}
}