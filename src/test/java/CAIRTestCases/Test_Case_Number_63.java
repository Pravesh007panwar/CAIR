package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_63 extends InnsightLogin{
	//Test Scenario:Ability to create heat maps relative to density of geo-tagged and geo- inferenced data, to include various search/query logic/algorithms.
	@AfterClass
	public void polygen() throws Exception {
		driver.findElement(By.id("txtTwSrch")).sendKeys("Police AND encounter");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
	
	  
	    driver.findElement(By.id("twGeo")).click();
	   // driver.findElement(By.xpath("//div[@id='geoTwittermap']/div/div/div[5]/div/div[2]/button/span/div/img")).click();
	   
		
	   

	}

}
