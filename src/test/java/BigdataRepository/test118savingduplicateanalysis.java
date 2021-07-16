package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DataIngestors.InnsightLogin;

public class test118savingduplicateanalysis extends InnsightLogin {
	@Test

	public void dublicateanalysissave() throws InterruptedException {

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
		driver.findElement(By.id("txtDescriptionCase")).sendKeys("Pravesh_test_name");

		driver.findElement(By.xpath("//*[@id=\"sveSrchFLtr\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"spnYes\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("divAnalysisId")).click();
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
		driver.findElement(By.id("txtDescriptionCase")).sendKeys("Pravesh_test_name");

		driver.findElement(By.xpath("//*[@id=\"sveSrchFLtr\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"spnYes\"]")).click();
		Thread.sleep(20000);
		driver.quit();
		
		

	}
}