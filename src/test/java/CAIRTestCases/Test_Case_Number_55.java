package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_55 extends InnsightLogin {
	@AfterClass
	public void polygen() throws Exception {
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
	
	  
	    driver.findElement(By.id("twGeo")).click();
	   // driver.findElement(By.xpath("//div[@id='geoTwittermap']/div/div/div[5]/div/div[2]/button/span/div/img")).click();
	   
		Thread.sleep(1000);
	   WebElement save= driver.findElement(By.id("idSaveSearch"));
	
	   save.click();
	   Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='sveSrchFLtr']/div/div/div[3]/button")).click();
	    driver.findElement(By.id("spnYes")).click();
	   

	}

}
