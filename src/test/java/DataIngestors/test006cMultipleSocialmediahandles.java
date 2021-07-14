package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test006cMultipleSocialmediahandles extends InnsightLogin {
	
	@AfterClass
	public void MultipleSocialMediaHandles() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtGrpSrch")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtGrpSrch")).sendKeys("kashmir Twitter");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#searchGrph")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.head")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[20]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(15000);

	
	
	}
	

}
