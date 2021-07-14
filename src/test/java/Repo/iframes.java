package Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframes {
	public static WebDriver driver;
	@Test
	public void frame() {
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[34]/a")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		
		
		driver.switchTo().frame("frame-top");
		
		System.out.println(driver.findElement(By.name("frame-top")).getText());

	}

}
