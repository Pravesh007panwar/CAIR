package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_52 extends InnsightLogin{

	
	@AfterClass
	public void gender() throws Exception {
		//search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Modi");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("twDashboard")).click();
	    //
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement Element = driver.findElement(By.xpath("//*[@id=\"widget_dashboard_47-1\"]/div[2]/div[1]/span"));
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    
	    highLighterMethod(driver, Element);
	    
	    ////*[@id="ClNewAnalysis"]/div/div[2]/div/div[4]/div[1]/div/span
	}
	
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}
}
