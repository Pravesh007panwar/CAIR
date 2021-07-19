package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import Repo.InnsightLogin3;

public class Test096SelectEntitiesWidgets extends InnsightLogin3 {
	
	
	@Test
	public void SelectEntitiesWidgets() throws InterruptedException {
		
	CAIRHomePage hp = new CAIRHomePage(driver);
	hp.Search().sendKeys("India AND KAshmir");
	hp.searchicon().click();
	Thread.sleep(5000);
	CAIRDashboardPage dp = new CAIRDashboardPage(driver);
	dp.DashBoardButton().click();
	

	driver.findElement(By.xpath("//*[@id=\"widget_dashboard_1-1\"]/div[2]/ul/li[1]/span[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"widget_dashboard_1-1\"]/div[2]/ul/li[2]/span[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"widget_dashboard_1-1\"]/div[2]/ul/li[3]/span[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"widget_dashboard_1-1\"]/div[2]/ul/li[4]/span[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"widget_dashboard_1-1\"]/div[2]/div/div/i[1]")).click();
	
	
	}

}
