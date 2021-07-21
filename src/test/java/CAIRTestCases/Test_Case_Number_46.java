package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_46 extends InnsightLogin{

	
	@AfterClass
	public void highlight() throws Exception {
		//search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("Police AND encounter");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"twColrelate\"]")).click();
	    Thread.sleep(1000);
WebElement ele = driver.findElement(By.xpath("//*[@id=\"Corelation\"]/div/div/div[2]/div/div[1]"));
		
		highLighterMethod(driver, ele);
		Thread.sleep(2000);
		
		
	}
	////*[@id="Corelation"]/div/div/div[2]/div/div[1]
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}
}
