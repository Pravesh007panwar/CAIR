package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test011queriedcontentrealtime extends InnsightLogin {
	
	@AfterClass
	public void DS() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.xpath("//*[@id=\"searchTweet\"]")).click();

		Thread.sleep(30000);
		
		driver.quit();
		
		
	}

}
