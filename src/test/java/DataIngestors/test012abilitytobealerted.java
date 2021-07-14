package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test012abilitytobealerted extends InnsightLogin {
	
	@AfterClass
	public void creatingalert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("div.sprite.setting-icon")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[14]/div[2]/div[2]/div[2]/div[29]/div[1]/div[2]/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtAlertsName")).sendKeys("PraveshInnefu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtAlertskey")).sendKeys("My INDIA");
		Thread.sleep(2000);
		driver.findElement(By.id("textFrequencykey")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#AnySentiment")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#usealertmail")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#alrtemailval")).clear();
		driver.findElement(By.cssSelector("input#alrtemailval")).sendKeys("pravesh.panwar@innefu.com");
		driver.findElement(By.cssSelector("input#alrtemailvalcc")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#alrtemailvalcc")).sendKeys("pravesh.panwar@innefu.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#alertNotification")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[54]/div/div/div[3]/div/span[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[20]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.sprite.alert-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtSrcAlerts")).sendKeys("praveshInnefu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#btnSrcAlerts")).click();
		Thread.sleep(10000);
	}
		
		
	}
