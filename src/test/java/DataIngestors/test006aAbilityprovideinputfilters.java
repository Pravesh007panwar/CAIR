package DataIngestors;

import java.awt.AWTException;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test006aAbilityprovideinputfilters extends InnsightLogin {

	@AfterClass

	public void polygon() throws InterruptedException, AWTException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("//*[@id=\"searchTweet\"]")).click();
		Thread.sleep(2000);
		WebElement map = driver.findElement(By.xpath("//*[@id=\"twGeo\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", map);
		map.click();
		driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[5]/div/div[2]/button")).click();
		Thread.sleep(2000);

		Actions poly = new Actions(driver);

		WebElement map2 = driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]"));

		poly.moveToElement(map2);
		poly.click();
		poly.moveByOffset(25, 0);
		poly.moveByOffset(90, 0);
		poly.moveByOffset(20, -10).click();

		poly.moveByOffset(-30, 15);

		poly.moveByOffset(-50, 20);

		poly.release();
		poly.build().perform();

		WebElement map3 = driver
				.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]/div[1]"));

		poly.moveToElement(map3);
		poly.click();
		poly.moveByOffset(-55, 0);
		poly.moveByOffset(10, 15).click();
		poly.moveByOffset(-50, 20);

		poly.doubleClick();

		poly.release();

		poly.build().perform();

	}
}