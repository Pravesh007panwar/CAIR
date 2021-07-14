package BigdataRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test038popularnewspapersmultiplecountries extends InnsightLogin {
@AfterClass
	
	public void newspaper() throws InterruptedException, AWTException {

	
	driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
	Thread.sleep(12000);
	String str = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]/div/span[4]")).getText();
	System.out.println(str);
	WebElement blog = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]/div/span[4]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", blog);
	Thread.sleep(10000);
	driver.quit();
}
}
