package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Repo.windowHandles;

public class test005abilityquerydatafromwebsites extends InnsightLogin {
	
	@Test(groups= {"Smoke"})
	public void MultipleSocialMediaHandles() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		  WebElement element = driver.findElement(By.id("ulEntifilSource"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", element);
		  js.executeScript("window.scrollBy(0,100)");
		  Thread.sleep(14000);
		 
		
			/*
			 * WebElement element1 = driver.findElement(By.id("ulEntifilSource"));
			 * element.click(); Actions act = new Actions(driver);
			 * act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
			 * System.out.println("Scroll down perfomed"); Thread.sleep(3000);
			 */
		 
		
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[13]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(15000);
		
		driver.quit();
		
		
	}

}
