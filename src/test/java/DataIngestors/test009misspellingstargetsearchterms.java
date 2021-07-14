package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class test009misspellingstargetsearchterms extends InnsightLogin {


@AfterClass
public void misspellingstargetsearchterms() throws Exception {
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("moid");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#searchTweet")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();
	Thread.sleep(12000);
}
}