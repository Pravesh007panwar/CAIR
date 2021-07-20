package CAIRTestCases;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;

public class test009misspellingstargetsearchterms extends InnsightLogin {


@Test
public void misspellingstargetsearchterms() throws Exception {
	
	CAIRHomePage hp = new CAIRHomePage(driver);
	Thread.sleep(2000);
	hp.Search().sendKeys("Moid");
	Thread.sleep(2000);
	hp.searchicon().click();
	
}
}