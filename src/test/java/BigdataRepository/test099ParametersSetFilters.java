package BigdataRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class test099ParametersSetFilters extends InnsightLogin3 {

	@Test
	public void ParametersSetFilters() throws InterruptedException {

		CAIRHomePage Homepage = new CAIRHomePage(driver);
		Homepage.Search().sendKeys("Kashmir OR Jammu");
		Homepage.searchicon().click();
		Thread.sleep(10000);
		

		CAIRDashboardPage Dashboard = new CAIRDashboardPage(driver);
		Dashboard.DashBoardButton().click();
		Thread.sleep(5000);

		Actions Act = new Actions(driver);
		Act.moveToElement(Dashboard.TOPLANGUAGES()).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				Dashboard.TOPLANGUAGES());
		Thread.sleep(2000);
		Act.moveToElement(Dashboard.ORG()).build().perform();
		Thread.sleep(5000);

		Act.moveToElement(Dashboard.TOPIMAGES()).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				Dashboard.TOPIMAGES());
		Thread.sleep(2000);
		Act.moveToElement(Dashboard.TOPURLS()).build().perform();
		Thread.sleep(5000);

		Act.moveToElement(Dashboard.TOPURLS()).build().perform();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				Dashboard.TOPURLS());
		Thread.sleep(2000);
		Act.moveToElement(Dashboard.HOURLYACTIVITYCOUNT()).build().perform();
		Thread.sleep(5000);

	}

}
