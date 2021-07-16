package BigdataRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DataIngestors.InnsightLogin;

public class test120Auditlogs extends InnsightLogin {

	@Test
	public void AuditLogs() throws InterruptedException {

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("divSettingId"))).build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.id("divSettingId"));
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", collection);
		Thread.sleep(2000);
		collection.click();
		Thread.sleep(2000);
      
		WebElement logs = driver.findElement(By.id("UserLogAddPanel"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", logs);
		logs.click();
		Thread.sleep(2000);
		

	}

}
