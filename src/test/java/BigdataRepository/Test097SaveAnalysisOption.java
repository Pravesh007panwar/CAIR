package BigdataRepository;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class Test097SaveAnalysisOption extends InnsightLogin3 {

	@Test
	public void SaveAnalysisOption() throws InterruptedException {

		CAIRHomePage Homepage = new CAIRHomePage(driver);
		Homepage.Search().sendKeys("(arnab AND goswami) OR (अर्णब  AND गोस्वामी ) OR (अर्णब  AND गोस्वामी )");
		Homepage.searchicon().click();
		Thread.sleep(2000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.Save().click();
		dp.SetAnalysisName().clear();
		dp.SetAnalysisName().sendKeys("Pravesh_Test");
		dp.SetSnapshotName().clear();
		dp.SetSnapshotName().sendKeys("Pravesh_Test007");
		dp.SetDescription().clear();
		dp.SetDescription().sendKeys("This is a Testing Analysis");
		dp.SaveAnalysisButton().click();
		dp.SaveAnalysisconfirmAlert().click();
		Homepage.PastAnalysis().click();

	}

}
