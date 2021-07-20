package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class Test005abilityquerydatafromwebsites extends InnsightLogin {

	@Test
	public void MultipleSocialMediaHandles() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(1000);
		hp.Advancedfilter().click();
		WebElement element = driver.findElement(By.id("ulEntifilSource"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(14000);
		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.SetWebSite().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(10000);
		driver.quit();

	}

}
