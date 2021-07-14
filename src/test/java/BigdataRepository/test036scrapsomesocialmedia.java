package BigdataRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test036scrapsomesocialmedia extends InnsightLogin {
	@AfterClass
	
	public void scrapingsocialmedia() throws InterruptedException, AWTException {

		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[1]/div/div/div[2]/div/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("InnefuCollectionTest");
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("Kashmir");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-9\"]/label/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-10\"]/label/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-11\"]/label/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-13\"]/label/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-15\"]/label/div/div/div[1]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		
		
		 driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click(); 
		 
		 Thread.sleep(2000); 
		 driver.get("http://192.168.2.193:8081/innsight");
		 driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
			driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
			driver.findElement(By.cssSelector("span#searchTweet")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"twDashboard\"]")).click();
			Thread.sleep(15000);

			String SB = new String(

					driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/span")).getText());
			System.out.println("Testcase:" + SB);

			WebElement ele = driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/span"));
			// Create object of a JavascriptExecutor interface
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// use executeScript() method and pass the arguments
			// Here i pass values based on css style. Yellow background color with solid red
			// color border.
			js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", ele);
			Thread.sleep(10000);
			driver.quit();
		 
		 
		 
		 
	}
	
	
}


