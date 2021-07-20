package CAIRTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class Test026MonitorProfilesSpecificwebsites extends InnsightLogin {

	// System has a provision to monitor people profiles in specific websites
	@AfterClass
	public void profile() throws Exception {

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(10000);
		Actions a = new Actions(driver);
		a.moveToElement(hp.Collections()).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				hp.Collections());
		hp.Collections().click();
		Thread.sleep(5000);

		Set<String> mulwindow = driver.getWindowHandles();
		ArrayList<String> newwindow = new ArrayList<>(mulwindow);
		driver.switchTo().window(newwindow.get(1));

		driver.findElement(By.linkText("Add New Collection")).click();
		driver.findElement(By.id("mat-input-1")).click();
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.id("mat-input-1")).sendKeys("asds");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']/form/div[2]/button/span")).click();
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]"));
		System.out.println(radio.getText());
		radio.click();
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']/form/div[2]/div/button[2]/span")).click();
		driver.findElement(
				By.xpath("//div[@id='cdk-step-content-0-2']/collection-keyword/div/add-profile/div/div/small/button"))
				.click();
		driver.findElement(By.id("mat-input-17")).clear();
		driver.findElement(By.id("mat-input-17")).sendKeys("narendra modi");
		driver.findElement(
				By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-profile-search/div[2]/div/div[2]/button/span"))
				.click();
		driver.findElement(By.linkText("Narendra Modi Pm")).click();
		driver.findElement(
				By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-profile-search/div[2]/div/div[2]/button[2]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@id='cdk-step-content-0-2']/collection-keyword/div/add-profile/div/div[3]/button[2]/span"))
				.click();
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-3']/form/div[2]/div[5]/button[2]/span")).click();
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-4']/app-completed/div/div[3]/button[2]/span"))
				.click();
		driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/app-confirm-dialog/div[2]/button"))
				.click();
		Thread.sleep(3000);
		driver.switchTo().window(newwindow.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='headingfour']/h4/a/span[3]")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"profileSrchModal\"]/div/div/div[4]/div/span[4]")).click();
		driver.findElement(By.id("txtSrchProfile")).sendKeys("narendramodi");
		Thread.sleep(1000);
		driver.findElement(By.id("btnSrchProfile")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//span[@onclick='addProfileMain()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apply")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("twReport")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar_left\"]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("rptTwUsrdtl")).click();
		driver.findElement(By.xpath("//*[@id=\"aa\"]")).sendKeys("narendramodi");
		Thread.sleep(1000);
		driver.findElement(By.id("btnUserDetailReport")).click();

	}

}