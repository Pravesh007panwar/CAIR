package BigdataRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class Test093ExportDatafromWidget extends InnsightLogin3 {
	
	
	@Test
	public void SelectEntitiesWidgets() throws InterruptedException {
		
	CAIRHomePage hp = new CAIRHomePage(driver);
	hp.Search().sendKeys("India AND KAshmir");
	hp.searchicon().click();
	Thread.sleep(5000);
	CAIRDashboardPage dp = new CAIRDashboardPage(driver);
	dp.DashBoardButton().click();
	
	Actions act = new Actions(driver);
	WebElement web = driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/div/a/span"));
	act.moveToElement(web).build().perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", web);
	web.click();
	
	
	}
}
