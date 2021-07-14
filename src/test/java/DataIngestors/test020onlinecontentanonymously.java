package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test020onlinecontentanonymously extends InnsightLogin {
	
	@AfterClass
	public void onlinecontent() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("//*[@id=\"searchTweet\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a#twDashboard")).click();
		Thread.sleep(20000);
		
		driver.quit();
		
		
	}

}
