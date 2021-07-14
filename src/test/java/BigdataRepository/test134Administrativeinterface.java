package BigdataRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test134Administrativeinterface extends InnsightLogin {
	@AfterClass
	
	public void Administrative() throws InterruptedException, AWTException {

		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		WebElement blog =	driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[11]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", blog);
		
		
	}
}