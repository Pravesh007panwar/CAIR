package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test007AddAvtar extends InnsightLogin {

	@AfterClass
	public void avatarcrawling() throws Exception {
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();
		Thread.sleep(12000);
		driver.get("http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-1")).sendKeys("Avatar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-2")).sendKeys("next");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-3")).sendKeys("next generation avatar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-4")).sendKeys("Innefu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-5")).sendKeys("innefu@innefu.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-6")).sendKeys("99663344");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-12']/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-15']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mat-select-value-15']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-475']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-16']/div/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-497']/span")).click();
		driver.findElement(By.id("mat-input-7")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]/span[1]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirm-dialog/div[2]/button[2]/span[1]")).click();
		Thread.sleep(12000);
		driver.quit();
	}

}