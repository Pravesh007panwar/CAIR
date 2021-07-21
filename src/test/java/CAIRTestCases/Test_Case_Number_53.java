package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Test_Case_Number_53 extends InnsightLogin{
	
	@AfterTest
	public void summerization() throws InterruptedException {
		//search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Kashmir");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	    WebElement Element = driver.findElement(By.xpath("//*[@id=\"ClNewAnalysis\"]/div/div[2]/div/div[4]/div[1]/div/span"));
	    highLighterMethod(driver, Element);
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.linkText("Close")).click();
	    Thread.sleep(3000);
	}
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}

}
