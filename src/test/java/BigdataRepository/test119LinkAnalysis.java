package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DataIngestors.InnsightLogin;

public class test119LinkAnalysis extends InnsightLogin {
	
	@Test
	public void linkanalysis() {
		
		driver.findElement(By.xpath("//*[@id=\"casetoggle\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"groupboxId\"]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"spnYes\"]")).click();
		
		
	}

}
