package BigdataRepository;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import DataIngestors.InnsightLogin;

public class Test025ScrapingPeriodsFrequencies extends InnsightLogin {

	// Test Scenario:Support for scheduling scraping periods and frequencies

	@AfterClass
	public void scheduling() throws Exception {

		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();

		System.out.println("************************");

		Thread.sleep(6000);
		System.out.println(driver.getCurrentUrl());
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String> obj = new ArrayList<>(allwindow);
		driver.switchTo().window(obj.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//td[12]/button/i")).click();
		driver.findElement(By.xpath("//div[@id='mat-menu-panel-1']/div/button")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']/form/div[2]/div/button[2]/span")).click();
		driver.findElement(By.id("mat-select-value-35")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-2672']/span")).click();
		driver.findElement(By.xpath(
				"//div[@id='cdk-step-content-0-2']/collection-keyword/div/add-profile/div/div[3]/button[2]/span"))
				.click();
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-3']/form/div[2]/div[5]/button[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-4']/app-completed/div/div[3]/button[2]/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-confirm-dialog/div[2]/button"))
				.click();
	}

}