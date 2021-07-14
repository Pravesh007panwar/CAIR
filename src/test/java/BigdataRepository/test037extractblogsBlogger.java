package BigdataRepository;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test037extractblogsBlogger extends InnsightLogin {

@AfterClass
	
	public void blogger() throws InterruptedException, AWTException {

	driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
	driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[8]/label/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
	Thread.sleep(12000);
	
	WebElement blog = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]/div/p[2]/img"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", blog);
	
	/*
	 * File ScreenshotFile = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(ScreenshotFile ,
	 * new File("D:\\CAIR\\blog.png"));
	 */
	
}
	
}
