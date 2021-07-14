package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class test022addproxy extends InnsightLogin {
@AfterClass
	public void Proxymanagementsection() throws InterruptedException {
		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-2\"]/span[1]/mat-panel-title/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-2\"]/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#mat-input-1")).sendKeys("192.168.2.100");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#mat-input-2")).sendKeys("80");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#mat-input-3")).sendKeys("pravesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#mat-input-4")).sendKeys("Innefu@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.mat-button-wrapper")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirm-dialog/div[2]/button[1]")).sendKeys(Keys.TAB,
				Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-2\"]/div/ul/li[2]/button")).click();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-avatar-list/section/div/div/div[2]/div/div/table/tbody/tr[1]/td[7]/a[1]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-avatar-add/section/div/div/div[2]/div/form/div[7]/div/button[1]")).click();
       Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-confirm-dialog/div[2]/button[1]")).click();
  
  
driver.quit();
}
}