package Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ScrollBar extends InnsightLogin2 {
	
	@Test
	public void MultipleSocialMediaHandles11() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		//At window level scrolling
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,100)");
		  Thread.sleep(10000);
		  
		  //At DOM level 
		  
		  js.executeScript("document.querySelector('.col-left-fitter').scrollTop=500");
		  Thread.sleep(10000);
		  js.executeScript("document.querySelector('ul#ulEntifilSource').scrollTop=5000");
		  Thread.sleep(10000);
		  js.executeScript("document.querySelector('ul#anslyisRssList').scrollTop=5000;");

		 
		 
		
			/*
			 * WebElement element1 = driver.findElement(By.id("ulEntifilSource"));
			 * element.click(); Actions act = new Actions(driver);
			 * act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
			 * System.out.println("Scroll down perfomed"); Thread.sleep(3000);
			 */
		 
		
		
		
		
	}

}
