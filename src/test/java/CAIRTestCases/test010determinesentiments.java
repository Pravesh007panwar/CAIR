package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test010determinesentiments extends InnsightLogin {

	@Test
	public void DS() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulThreatMatrixId\"]/li/label/span")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(40000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("//*[@id=\"Corelation\"]/div/div/div[1]/div/div[1]"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", collection);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement collection1 = driver.findElement(By.xpath("//*[@id=\"Corelation\"]/div/div/div[2]/div/div[1]"));
		js1.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection1);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement collection2 = driver.findElement(By.xpath("//*[@id=\"Hashtags\"]/div/div[1]"));
		js2.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection2);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement collection3 = driver.findElement(By.xpath("//*[@id=\"divartProfile\"]/div/div[1]"));
		js3.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection3);

		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		WebElement collection21 = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"));
		js21.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection21);

		JavascriptExecutor js32 = (JavascriptExecutor) driver;
		WebElement collection34 = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[2]/div[1]"));
		js32.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection34);

		Thread.sleep(12000);

		driver.quit();

	}

}
