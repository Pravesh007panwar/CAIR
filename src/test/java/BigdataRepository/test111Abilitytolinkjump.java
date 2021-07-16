package BigdataRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DataIngestors.InnsightLogin;

public class test111Abilitytolinkjump extends InnsightLogin {
	@Test

	public void Maintaincontainer() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("searchTweet")).click();
		Thread.sleep(10000);
		
		WebElement articleshow = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", articleshow);
		
		Thread.sleep(3000);
		Actions Act = new Actions(driver);
		Act.moveToElement(driver.findElement(By.cssSelector("i.fa.fa-external-link.faprint.bottomimg"))).build().perform();
		Thread.sleep(10000);
		

		
	}
	
}