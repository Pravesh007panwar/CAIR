package DataIngestors;

import org.testng.annotations.AfterClass;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;

public class test014nondetectablewebcrawlers extends InnsightLogin {
	
	@AfterClass
	public void nondetectablewebcrawlers() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India");
		hp.searchicon().click();
		Thread.sleep(2000);
		hp.Advancedfilter().click();

		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.SetWebSite().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(10000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.DashBoardButton().click();
		Thread.sleep(20000);
		driver.quit();
		
		
	}

}
