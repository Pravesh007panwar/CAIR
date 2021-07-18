package DataIngestors;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test007AddAvtar extends InnsightLogin {

	@Test
	public void avatarcrawling() throws Exception {
		
		
		
		  Actions a = new Actions(driver); a.moveToElement(driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"))).build().perform();
		  driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  WebElement collection = driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a")); 
		  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", collection);
		
		 Set<String> window = driver.getWindowHandles();
	     Iterator<String> it= window.iterator();
	      String ChildID = it.next();
	      driver.switchTo().window(ChildID);
		
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-1")).sendKeys("Pravesh");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-2")).sendKeys("Panwar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-3")).sendKeys("next generation avatar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-4")).sendKeys("Innefu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-5")).sendKeys("innefu@innefu.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-6")).sendKeys("9966334490");
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
		Thread.sleep(15000);
		driver.quit();
	}

}