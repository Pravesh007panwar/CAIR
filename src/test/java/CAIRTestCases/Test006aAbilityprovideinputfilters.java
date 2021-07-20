package CAIRTestCases;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class Test006aAbilityprovideinputfilters extends InnsightLogin {
	@Test

	public void polygon() throws InterruptedException, AWTException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(1000);
		hp.searchicon().click();

		Thread.sleep(2000);
		CAIRDashboardPage art = new CAIRDashboardPage(driver);
		WebElement map = driver.findElement(By.xpath("//*[@id=\"twGeo\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", art.Map());
		art.Map().click();
		driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[5]/div/div[2]/button")).click();
		Thread.sleep(2000);

		Actions poly = new Actions(driver);
		poly.moveToElement(driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[8]/button"))).click().build().perform();
		WebElement map2 = driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]"));
		poly.moveToElement(map2);

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
		driver.quit();

	}
}