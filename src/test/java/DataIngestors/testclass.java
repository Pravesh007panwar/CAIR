package DataIngestors;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.Test;

public class testclass extends InnsightLogin {

	@Test(enabled = true)
	public void federatedsearch() throws InterruptedException, AWTException {
		driver.get(
				"http://office.authshieldserver.com:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[1]/div/div/div[2]/div/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("InnefuTestINSIGHT");
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-radio-5\"]/label/div[1]/div[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("PLApeople liberation army ");

		driver.findElement(By.xpath("//*[@id=\"mat-input-13\"]")).sendKeys("PLApeople liberation army ");
		;
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/div[5]/app-web-search/div[2]/button[2]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]")).click();

		driver.get("http://office.authshieldserver.com:8081/innsight");

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("PLA");

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[9]/label/span")).click();

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