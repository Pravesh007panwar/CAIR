package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_62 extends InnsightLogin{
	@AfterClass
	public void article() throws Exception
	{//Test Scenario:Ability for users to set alerts based on threat model thresholds or terms
		//Setting button click
				driver.findElement(By.id("divSettingId")).click();
				Thread.sleep(1000);
				//New Alert click
				driver.findElement(By.xpath("//*[@id=\"manageAlerts\"]/div[1]/div[2]/a")).click();
				Thread.sleep(1000);
				//Create Alert Start
				driver.findElement(By.id("txtAlertsName")).sendKeys("Terrorist Alert");
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
