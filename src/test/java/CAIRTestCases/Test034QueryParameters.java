package CAIRTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Test034QueryParameters extends InnsightLogin{
	
	@AfterClass
	public void query() throws Exception {
		
		driver.findElement(By.id("txtTwSrch")).sendKeys("India AND Kashmir");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]")).click();
	    driver.findElement(By.xpath("//ul[@id='sentiList']/li[2]/label/span")).click();
	    driver.findElement(By.xpath("//ul[@id='sentiList']/li[3]/label/span")).click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.id("twGeo")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[5]/div/div[2]/button/span/div/img")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]/div[5]/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"geoTwittermap\"]/div/div/div[2]/div[3]/div/div[3]/div[6]/img]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("twArticleLocation")).click();
	    driver.findElement(By.linkText("Advance Filter (5)")).click();
	    driver.findElement(By.xpath("//div[@id='headingfour']/h4/a/span[3]")).click();
	    driver.findElement(By.id("txtSrchProfile")).click();
	    driver.findElement(By.id("txtSrchProfile")).clear();
	    driver.findElement(By.id("txtSrchProfile")).sendKeys("kashmir");
	    driver.findElement(By.id("btnSrchProfile")).click();
	    driver.findElement(By.xpath("//div[@id='profile']/div/div[6]/div/div[4]/span")).click();
	    driver.findElement(By.xpath("//div[@id='profile']/div/div[6]/div/div[5]/span")).click();
	    driver.findElement(By.xpath("//span[@onclick='addProfileMain()']")).click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.linkText("Close")).click();
		Thread.sleep(6000);
		
	}

}