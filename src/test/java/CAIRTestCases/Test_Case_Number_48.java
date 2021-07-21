package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_48 extends InnsightLogin{
	
	@AfterClass
	public void analysis() throws Exception {
		//Test Scenario 48:Solution shall allow for threat models to be the basis of collecting data
		   //for further evaluation, analysis, and investigation
		WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Kashmir");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	    Thread.sleep(1000);
	    WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"ulThreatMatrixId\"]/li/label/span"));
	    checkbox.click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Apply")).click();
	    Thread.sleep(1000);
	    
	    //close button click
	    driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[2]")).click();
	    
	    
		
	}

}
