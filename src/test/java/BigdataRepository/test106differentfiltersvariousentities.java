package BigdataRepository;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class test106differentfiltersvariousentities extends InnsightLogin3 {
	
	
	@Test
	public void FilterEntities() {
		
	CAIRHomePage Homepage = new CAIRHomePage(driver);
	Homepage.Search().sendKeys("India");
	Homepage.searchicon().click();
	
	
	
	}

}
