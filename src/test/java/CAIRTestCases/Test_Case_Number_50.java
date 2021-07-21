package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_50 extends InnsightLogin{

	
	@AfterClass
	public void alert() throws Exception {
		//Setting button click
		driver.findElement(By.id("divSettingId")).click();
		Thread.sleep(1000);
		//New Alert click
		driver.findElement(By.xpath("//*[@id=\"manageAlerts\"]/div[1]/div[2]/a")).click();
		Thread.sleep(1000);
		//Create Alert Start
		driver.findElement(By.id("txtAlertsName")).sendKeys("Terrorist");
		Thread.sleep(1000);
		driver.findElement(By.id("txtAlertskey")).sendKeys("Terr");
		Thread.sleep(1000);
		driver.findElement(By.id("textFrequencykey")).sendKeys("70%");
		driver.findElement(By.id("txtUserkey")).sendKeys("Rajan");
		Select select=new Select(driver.findElement(By.id("sundayhr")));
		select.selectByVisibleText("02");
		Select select1=new Select(driver.findElement(By.id("sundaymnt")));
		select1.selectByVisibleText("20");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createAlertsModal\"]/div/div/div[3]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("spnYes")).click();
	}
}
