package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class test021pausedeleteautocrawls extends InnsightLogin{
	
	@AfterClass

	public void collection() throws InterruptedException {
		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(25000);
		driver.findElement(By.name("txtSearch")).sendKeys();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button"))
				.sendKeys(Keys.ENTER, Keys.ARROW_UP, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-primary"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtSearch")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button"))
				.sendKeys(Keys.ENTER, Keys.ARROW_UP, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-primary"))
				.click();
		Thread.sleep(10000);
	}
}
