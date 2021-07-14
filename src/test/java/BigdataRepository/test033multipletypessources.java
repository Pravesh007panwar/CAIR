package BigdataRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test033multipletypessources extends InnsightLogin {

	@AfterClass

	public void historicalcontent() throws InterruptedException

	{
		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"twDashboard\"]")).click();
		Thread.sleep(15000);

		String SB = new String(

				driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/span")).getText());
		System.out.println("Testcase:" + SB);

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/span"));
		// Create object of a JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with solid red
		// color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", ele);
		Thread.sleep(10000);
		driver.quit();
	}

}
