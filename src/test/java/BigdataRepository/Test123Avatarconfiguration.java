package BigdataRepository;

import org.testng.annotations.Test;

import CAIRObjectRepository.CollectionPage;
import Repo.InnsightLogin2;

public class Test123Avatarconfiguration extends InnsightLogin2 {
	@Test
	public void Avatarconfig123() throws InterruptedException {

		Thread.sleep(2000);
		CollectionPage cp = new CollectionPage(driver);
		cp.ManageAvtarClick().click();

		cp.AddAvtar().click();

	}
}
