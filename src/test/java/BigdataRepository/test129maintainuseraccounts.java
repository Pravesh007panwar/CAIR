package BigdataRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test129maintainuseraccounts extends InnsightLogin {
	@AfterClass
	
	public void Administrative() throws InterruptedException, AWTException {

		driver.findElement(By.id("divSettingId")).click();
		
		WebElement userlog = driver.findElement(By.id("linkUsers"));
		userlog.click();
		WebElement highlight = driver.findElement(By.xpath("//*[@id=\"manageUsers\"]/div[1]/div[1]/h2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", highlight);
		
		
	}
}