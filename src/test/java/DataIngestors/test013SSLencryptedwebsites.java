package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test013SSLencryptedwebsites extends InnsightLogin {
	
	@AfterClass
	public void SSLencryption() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India");
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[4]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[2]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(12000);
		driver.findElement(By.cssSelector("a#twDashboard")).click();
		Thread.sleep(20000);
		driver.quit();
		
		
	}

}
