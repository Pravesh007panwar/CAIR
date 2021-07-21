package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_58 extends InnsightLogin{
	@AfterClass
	public void polygen() throws Exception {
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
	
	  
	    driver.findElement(By.id("twGeo")).click();
	    Thread.sleep(2000);
	    //date calender open
	    driver.findElement(By.id("calmBox")).click();
	    //last 7 days click
	    driver.findElement(By.id("spnOndy")).click();
	    driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[8]")).click();
	    
}
}