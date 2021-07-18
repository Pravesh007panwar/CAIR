package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Repo.InnsightLogin2;

public class Test124selectchangeavatar extends InnsightLogin2 {
	
	@Test
	public void EditCollection() {
		

		driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button")).click();
		driver.findElement(By.cssSelector("i.flaticon-edit.mr-2")).click();
		
		
	}
	

}
