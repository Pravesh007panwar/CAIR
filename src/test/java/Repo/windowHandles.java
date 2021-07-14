package Repo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class windowHandles {
public static WebDriver driver;
	public static void main(String[] args) {
		
		 Actions a = new Actions(driver); a.moveToElement(driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"))).build().perform();
		  driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  WebElement collection = driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a")); 
		  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", collection);
		
		 Set<String> window = driver.getWindowHandles();
	     Iterator<String> it= window.iterator();
	      String ParentID = it.next();
	      String ChildID = it.next();
	      driver.switchTo().window(ChildID);
	      
	   

	}

}
