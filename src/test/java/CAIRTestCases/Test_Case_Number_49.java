package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_49 extends InnsightLogin {
	//Test Scenario 49: Ability for end users to manipulate weights and terms on threat model easily.
	@AfterClass
	public void manipulate() throws Exception {
		WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Kashmir");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	    Thread.sleep(1000);
	    WebElement highlight=driver.findElement(By.xpath("//*[@id=\"ClNewAnalysis\"]/div/div[2]/div/div[1]/div/div[1]/div[2]"));
	    highLighterMethod(driver, highlight);
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Apply")).click();
	    Thread.sleep(1000);
	    
	      //close button click
	    driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[2]")).click();
	}
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}
}
