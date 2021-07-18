package DataIngestors;

import org.testng.annotations.AfterClass;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;

public class test020onlinecontentanonymously extends InnsightLogin {

	@AfterClass
	public void onlinecontent() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(2000);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(2000);
		hp.searchicon().click();
		Thread.sleep(30000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.DashBoardButton().click();
		Thread.sleep(20000);
		driver.quit();

	}

}
