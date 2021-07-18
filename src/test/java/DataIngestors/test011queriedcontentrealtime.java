package DataIngestors;

import org.testng.annotations.AfterClass;

import CAIRObjectRepository.CAIRHomePage;

public class test011queriedcontentrealtime extends InnsightLogin {
	
	@AfterClass
	public void DS() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(2000);
		hp.Search().sendKeys("India");
		Thread.sleep(2000);
		hp.searchicon().click();
		Thread.sleep(30000);
		
		
		
		
	}

}
