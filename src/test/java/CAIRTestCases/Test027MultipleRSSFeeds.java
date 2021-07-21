package CAIRTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Test027MultipleRSSFeeds extends InnsightLogin{
	
	@AfterTest
	public void multiple() throws Exception {
		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();

		System.out.println("************************");
	
		 Thread.sleep(6000); 
		 System.out.println(driver.getCurrentUrl()); 
		 String currentwindow = driver.getWindowHandle();
		 Set<String> allwindow =driver.getWindowHandles(); 
		 ArrayList<String> obj = new ArrayList<>(allwindow); 
		 driver.switchTo().window(obj.get(1));
		System.out.println(driver.getCurrentUrl()); 
		driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container"
				+ "/mat-sidenav/div/mat-nav-list/mat-accordion[1]/mat-expansion-panel[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().window(obj.get(0));
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"lblCheckUnCheckAll\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
	    Thread.sleep(10000);
	    
		
	}

}