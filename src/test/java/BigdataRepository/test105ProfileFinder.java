package BigdataRepository;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;
import CAIRObjectRepository.ProfileManagerPage;
import Repo.InnsightLogin3;

public class test105ProfileFinder extends InnsightLogin3 {

	@Test
	public void profileFinder() throws InterruptedException {
		Thread.sleep(10000);
		CAIRHomePage Homepage = new CAIRHomePage(driver);
		Homepage.Profilefinder().click();
        Thread.sleep(10000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> move = windows.iterator();
		String ChildWindow = move.next();
		driver.switchTo().window(ChildWindow);
		Thread.sleep(10000);
		ProfileManagerPage Profilefinder = new ProfileManagerPage(driver);
		Profilefinder.SearchProfile().click();
		Profilefinder.EnterName().sendKeys("Pravesh");
		Profilefinder.Searchinputprofile().click();
		Thread.sleep(10000);
	}

}
