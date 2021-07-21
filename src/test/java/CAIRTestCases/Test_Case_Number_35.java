package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_35 extends InnsightLogin {

	@AfterClass
	public void ftp() throws InterruptedException {
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]")).click();
	    driver.findElement(By.id("lblCheckUnCheckAll")).click();
	    WebElement test=driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[13]/label/span"));
	    test.click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.linkText("Close")).click();
	    Thread.sleep(3000);
	    
		
	}
}
