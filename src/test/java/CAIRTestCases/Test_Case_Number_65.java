package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_65 extends InnsightLogin{
	@AfterClass
	public void map() throws Exception {
		
		driver.findElement(By.id("txtTwSrch")).sendKeys("Police AND encounter");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twGeo")).click();
		driver.findElement(By.id("twArticleLocation")).click();
	    //satellite location click
	   driver.findElement(By.xpath("//div[@id='geoTwittermap']/div/div/div/div[3]")).click();
	    driver.findElement(By.id("38083934-07B1-44F9-9ADD-0DAC44B0BA63")).click();
	}
}
