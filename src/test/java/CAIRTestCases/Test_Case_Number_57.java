package CAIRTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_57 extends InnsightLogin {

	// Test Scenario:Ability for end users to apply a geo-fence to an area and
	// display a stream of content filtered in that area
	@AfterClass
	public void tracklocation() throws Exception {
		String collectioname = "Police encounter test";
		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();

		System.out.println("************************");

		Thread.sleep(6000);
		System.out.println(driver.getCurrentUrl());
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String> obj = new ArrayList<>(allwindow);
		driver.switchTo().window(obj.get(1));
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.linkText("Add New Collection")).click();
		driver.findElement(By.id("mat-input-1")).click();
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.id("mat-input-1")).sendKeys(collectioname);
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']/form/div[2]/button/span")).click();
		// track location radiobox click
		WebElement radiobox = driver.findElement(By.id("mat-radio-4"));
		radiobox.click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		// tracklocation name enter
		WebElement tracklocation = driver.findElement(By.id("mat-input-9"));
		tracklocation.sendKeys("Delhi");
		// track location in km
		WebElement tracklocationkm = driver.findElement(By.id("mat-input-10"));
		tracklocationkm.sendKeys("20");
		// track location Draw Area
		driver.findElement(By.xpath(
				"//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/div[4]/track-location/form/div[1]/div[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		// facebook button toggle click
		WebElement facebook = driver.findElement(By.id("mat-slide-toggle-27"));
		facebook.click();
		driver.findElement(By.xpath(
				"//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/div[4]/track-location/div[3]/button[2]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// submit button click
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]/span[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirm-dialog/div[2]/button[1]/span[1]")).click();
		driver.switchTo().window(obj.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		driver.findElement(By.id("geoLocationFindId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtPlace")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("txtRadius")).sendKeys("30");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"geoLocationMapFilter\"]/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
		//
		driver.findElement(By.xpath("//*[@id=\"FindLocationModal\"]/div/div/div[1]/div/div[1]/button[1]")).click();
		// Apply button click
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(3000);

	}

}
