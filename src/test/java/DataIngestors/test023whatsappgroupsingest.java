package DataIngestors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class test023whatsappgroupsingest extends InnsightLogin{

@AfterClass

public void ingestdatafromwhatsappgroups() throws InterruptedException {

	driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[9]/label/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("div#calmBox")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[8]")).click();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("a#twReport")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"sidebar_left\"]/ul/li[8]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a#rpt360WhatsAppPhoneAnalysis")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"WhatsAppPhoneAnalysisSpanId\"]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a.multiselect-all")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#btnWhatsAppPhoneRpt")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input#btnWhatsAppPhoneRpt")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN);

	
	
	driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[9]/label")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
	
	try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert data: " + alertText);
        alert.accept();
    } catch (NoAlertPresentException e) {
        e.printStackTrace();
    }
	
	
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("div#calmBox")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[8]")).click();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("a#twReport")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"sidebar_left\"]/ul/li[8]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rpt360WhatsAppGroupAnalysis\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"WhatsAppPhoneGroupAnalysisSpanId\"]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a.multiselect-all")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"btnWhatsAppPhoneGroupRpt\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"WhatsAppGroupAnalysisSpanId\"]/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"WhatsAppGroupAnalysisSpanId\"]/div/ul/li[2]/a/label/input")).click();
	driver.findElement(By.xpath("//*[@id=\"btnWhatsAppGroupRpt\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"btnWhatsAppGroupRpt\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
			Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
	Thread.sleep(10000);
}
	
	
	
	
	
}
