package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Test_Case_Number_54 extends InnsightLogin{
	@AfterTest
	public void chinese() throws Exception {
	//search key enter
    WebElement search=driver.findElement(By.id("txtTwSrch"));
    search.sendKeys("India AND Kashmir");
    search.sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
    WebElement Element = driver.findElement(By.xpath("//*[@id=\"ClNewAnalysis\"]/div/div[2]/div/div[5]/div[1]/div[1]/h4/span"));
    js.executeScript("arguments[0].scrollIntoView();", Element);
    highLighterMethod(driver, Element);
    Thread.sleep(3000);
    driver.findElement(By.id("lblCheckUnCheckAll")).click();
    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[25]/label/span")).click();
    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[24]/label/span")).click();
    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[22]/label/span")).click();

    driver.findElement(By.linkText("Apply")).click();
    driver.findElement(By.linkText("Apply")).click();
    driver.findElement(By.linkText("Close")).click();
    driver.findElement(By.id("calmBox")).click();
    driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[7]")).click();
    driver.findElement(By.xpath("//span[@onclick='dapply()']")).click();
    WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"divartplace\"]/div/div[1]/span[1]"));
    js.executeScript("arguments[0].scrollIntoView();", Element1);
    
	
}

public void highLighterMethod(WebDriver driver, WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
}
}
