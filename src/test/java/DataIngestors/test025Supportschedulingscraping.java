package DataIngestors;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class test025Supportschedulingscraping extends InnsightLogin {
@AfterClass

	public void Addcllection() throws InterruptedException, AWTException {
		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[1]/div/div/div[2]/div/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("InnefuTest");
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("Modi");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div")).click();
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click();
		Thread.sleep(10000);
	}
}
