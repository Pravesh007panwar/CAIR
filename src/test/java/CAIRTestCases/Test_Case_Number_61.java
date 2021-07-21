package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_61 extends InnsightLogin {
	@AfterClass
	public void article() throws Exception {
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.id("txtTwSrch")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"Country\"]/div/div[1]/span[1]"));
		highLighterMethod(driver, ele1);
		WebElement check=driver.findElement(By.xpath("//*[@id=\"hashTagAll\"]/li[2]/a/label/span"));
		check.click();
		Thread.sleep(2000);
        WebElement ele2=driver.findElement(By.xpath("//*[@id=\"AuthorCountry\"]/div/div[1]"));
        highLighterMethod(driver, ele2);
        WebElement check1=driver.findElement(By.xpath("//*[@id=\"hashTagAll\"]/li[2]/a/label/span"));
		check1.click();
	}

	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].setAttribute('style', 'background:blue; border: 2px solid red;');", element);
	}

}
