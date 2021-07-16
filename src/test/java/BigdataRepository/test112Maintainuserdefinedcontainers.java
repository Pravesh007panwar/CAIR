package BigdataRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DataIngestors.InnsightLogin;

public class test112Maintainuserdefinedcontainers extends InnsightLogin {
	@Test

	public void Maintaincontainer() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("searchTweet")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("idSaveSearch")).click();
		driver.findElement(By.id("srchname")).clear();
		driver.findElement(By.id("srchname")).sendKeys("Pravesh_test");
		driver.findElement(By.id("txtSnapShot")).clear();
		driver.findElement(By.id("txtSnapShot")).sendKeys("Pravesh_test_snapshot");
		driver.findElement(By.id("txtDescriptionCase")).clear();
		driver.findElement(By.id("txtDescriptionCase")).sendKeys("Sample Analysis of Innefu test data");

		driver.findElement(By.xpath("//*[@id=\"sveSrchFLtr\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"spnYes\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("divAnalysisId")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"casetoggle\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtGrpSrch")).sendKeys("pravesh");
		Thread.sleep(2000);
		driver.findElement(By.id("txtGrpSrch")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"groupboxId\"]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"spnYes\"]")).click();
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("spnCaseMain"))).build().perform();
		
		Thread.sleep(13000);
		driver.quit();
		
		
	}
	
}