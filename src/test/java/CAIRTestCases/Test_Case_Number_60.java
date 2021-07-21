package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_60 extends InnsightLogin{
	@AfterClass
	public void polygen() throws Exception {
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
	
	  
	    driver.findElement(By.id("twGeo")).click();
	    Thread.sleep(2000);
	    //user location click
	    driver.findElement(By.id("twUserLocation")).click();
	    driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[5]/div/div[2]/button/span/div/img")).click();
	   WebElement click1=driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]/div[43]/div[1]/div"));
	   click1.click();
	   WebElement click2=driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]/div[43]/div[2]/div"));
	   click2.click();
	    
}

}
