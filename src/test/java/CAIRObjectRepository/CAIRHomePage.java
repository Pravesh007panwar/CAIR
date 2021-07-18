package CAIRObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CAIRHomePage {

	WebDriver driver;

	By Account = By.id("divlogout");
	By Settings = By.id("divSettingId");
	By Collections = By.xpath("/html/body/form/div/header/div[2]/ul/li[13]/a");
	By Profilefinder = By.xpath("/html/body/form/div/header/div[2]/ul/li[12]/a");
	By Alert = By.xpath("/html/body/form/div/header/div[2]/ul/li[7]");
	By Utility = By.xpath("/html/body/form/div/header/div[2]/ul/li[3]/a/div[1]");
	By Search = By.id("txtTwSrch");
	By searchicon = By.id("searchTweet");
	By Newanalysis = By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[3]/a");
	By PastAnalysis = By.xpath("//*[@id=\"casetoggle\"]/a");
	By Advancedfilter = By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a");

	public CAIRHomePage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement Account() {

		return driver.findElement(Account);
	}

	public WebElement Settings() {

		return driver.findElement(Settings);
	}

	public WebElement Collections() {

		return driver.findElement(Collections);
	}

	public WebElement Profilefinder() {

		return driver.findElement(Profilefinder);
	}

	public WebElement Alert() {

		return driver.findElement(Alert);
	}

	public WebElement Utility() {

		return driver.findElement(Utility);
	}

	public WebElement Search() {

		return driver.findElement(Search);
	}

	public WebElement searchicon() {

		return driver.findElement(searchicon);
	}

	public WebElement Newanalysis() {

		return driver.findElement(Newanalysis);
	}

	public WebElement PastAnalysis() {

		return driver.findElement(PastAnalysis);
	}

	public WebElement Advancedfilter() {

		return driver.findElement(Advancedfilter);
	}

}
