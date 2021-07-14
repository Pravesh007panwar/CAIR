package DataIngestors;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TextAnalytics extends InnsightLogin {
	
	@Test(enabled = false)
	public void extractblogsfromBlogger() throws InterruptedException, AWTException {
		
		

//System should be able to extract blogs from Blogger

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("(Mallick)");
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[8]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a#twDashboard")).click();
		Thread.sleep(10000);
		
	}

///**********	The solution should pull data from the popular newspapers in multiple countries including some paid subscriptions as well
	@Test(enabled = true)
	public void pulldatamultiplecountriesformnewspaper() throws InterruptedException, AWTException {
		Thread.sleep(5000);
//WebDriverWait driverWait = new WebDriverWait( new SystemClock(), Driver, TimeSpan.FromSeconds( 20 ), TimeSpan.FromSeconds( 3 ) );

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a#twDashboard")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ClNewAnalysis\"]/div/div[2]/div/div[4]/div[1]/span/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"newsfeedSourceDiv\"]/span[2]")).click();

		Select country = new Select(driver.findElement(By.cssSelector("select#ddlCountryNewsSrcMdal")));
		country.selectByVisibleText("Afghanistan");
		
		Thread.sleep(4000);

		Select country1 = new Select(driver.findElement(By.cssSelector("select#ddlCountryNewsSrcMdal")));
		country1.selectByVisibleText("Abu Dhabi");
		Thread.sleep(4000);
		Select country2 = new Select(driver.findElement(By.cssSelector("select#ddlCountryNewsSrcMdal")));
		country2.selectByVisibleText("India");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"searchNewsSourceModal\"]/div/div[1]/div[1]/button")).click();

	}
}