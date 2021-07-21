package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_47 extends InnsightLogin{

	
	@AfterClass
	public void highlight() throws Exception {
		//search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Kashmir");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"twColrelate\"]")).click();
	    Thread.sleep(1000);

		
		 WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"Hashtags\"]/div/div[1]/span[1]"));
		 highLighterMethod(driver, ele1);
	}
	
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}

}
