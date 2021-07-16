package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Repo.InnsightLogin2;

public class test122managementvirtualidentities extends InnsightLogin2 {
	
	@Test
	public void virtualidentities() throws InterruptedException {
		
		 driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/ul/li[1]/button")).click();
			Thread.sleep(2000);
			

		
		
	}
	

}
