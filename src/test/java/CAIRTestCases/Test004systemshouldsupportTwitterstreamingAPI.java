package CAIRTestCases;

import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class Test004systemshouldsupportTwitterstreamingAPI extends InnsightLogin {

	@Test
	public void MultipleSocialMediaHandles() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(1000);
		hp.Advancedfilter().click();

		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.SetTwiter().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(10000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.DashBoardButton().click();
		Thread.sleep(15000);
		driver.quit();

	}

}
