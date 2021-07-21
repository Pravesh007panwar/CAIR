package CAIRTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_40 extends InnsightLogin {
// Test Case 40: System should perform federated search through some of the search engines like Baidu, Google, Duck Duck Go
	@AfterClass
	public void collection() throws Exception {
		String collectioname="Police encounter";
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
		//track event radiobox click
		WebElement radiobox = driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label/span[1]"));
		radiobox.click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		//trackevent name enter
		WebElement trackevent=driver.findElement(By.id("mat-chip-list-input-0"));
		trackevent.sendKeys("twitter");
		trackevent.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement toggle=driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-10\"]/label/div"));
		toggle.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]/span[1]")).click();
		driver.switchTo().window(obj.get(0));
	    System.out.println(driver.getCurrentUrl());
	    //search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("Police AND encounter");
	    search.sendKeys(Keys.ENTER);
		
		 driver.findElement(By.linkText("Advance Filter (5)")).click();
		    driver.findElement(By.id("lblCheckUnCheckAll")).click();
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[14]/label/span")).click();
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[15]/label/span")).click();
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[16]/label/span")).click();
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[17]/label/span")).click();
		    Thread.sleep(2000);
		   
	    //Apply button click
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.linkText("Close")).click();
	    Thread.sleep(3000);
	    
	    
	    
	    
	    
		
	}

}
