package BigdataRepository;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class test098QueriestogetherSearch extends InnsightLogin3 {
	
	
	@Test
	public void QueriestogetherSearch() {
		
	CAIRHomePage Homepage = new CAIRHomePage(driver);
	Homepage.Search().sendKeys("(arnab AND goswami) OR (अर्णब  AND गोस्वामी ) OR (अर्णब  AND गोस्वामी )");
	Homepage.searchicon().click();
	
	
	
	}

}
