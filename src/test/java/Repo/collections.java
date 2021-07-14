package Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class collections {
public static WebDriver driver;

	public void collec() {
		
		System.out.println("Click on Collection");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"))).build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", collection);
		collection.click();

	}

}
