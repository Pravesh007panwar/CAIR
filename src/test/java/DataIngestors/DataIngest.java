package DataIngestors;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DataIngest extends InnsightLogin {

	@AfterClass
	public void DataIn() throws InterruptedException, AWTException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.cssSelector("a#twDashboard")).click();

	}
//*****Demonstration of extraction of data from any website/ social media platform where lot of java script is available, for instance: Facebook, Instagram******
	@Test(priority = 15)
	public void AbilityBrowserBasedinteractivescraping() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("testingq23@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Innefu@123");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(20000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(20000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[2]/div/a/div[1]/div[1]/img"))
				.click();
		Thread.sleep(20000);
		driver.quit();

	}

	@Test(priority = 2)
	public void Geographicallyboundpolygon() {
	System.out.println("Poygon need to implement");

	}
//*********Multiple keywords: The system should allow boolean query (AND, OR, etc) using multiple keywords to display the data. 
	@Test(priority = 3)

	public void Multiplekeywords() throws InterruptedException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi AND PM");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.cssSelector("a#twColrelate")).click();
		Thread.sleep(13000);
	}
//*****Multiple Social Media Handles: The system should allow boolean query (AND, OR, etc) using multiple social media handles to display the data.
	@Test(priority = 1)

	public void MultipleSocialMediaHandles() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtGrpSrch")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtGrpSrch")).sendKeys("kashmir Twitter");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#searchGrph")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.head")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[20]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(15000);

	}
//***********System should allow creating alerts – 
	
	@Test(priority = 2)
	public void Systemshouldallowcreatingalerts() throws InterruptedException {

		driver.findElement(By.cssSelector("div.sprite.setting-icon")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[14]/div[2]/div[2]/div[2]/div[29]/div[1]/div[2]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#txtAlertsName")).sendKeys("PraveshInnefu");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#txtAlertskey")).sendKeys("My INDIA");
		Thread.sleep(3000);
		driver.findElement(By.id("textFrequencykey")).sendKeys("50");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#AnySentiment")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#usealertmail")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#alrtemailval")).clear();
		driver.findElement(By.cssSelector("input#alrtemailval")).sendKeys("pravesh.panwar@innefu.com");
		driver.findElement(By.cssSelector("input#alrtemailvalcc")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#alrtemailvalcc")).sendKeys("pravesh.panwar@innefu.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#alertNotification")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[54]/div/div/div[3]/div/span[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[20]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.sprite.alert-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#txtSrcAlerts")).sendKeys("praveshInnefu");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#btnSrcAlerts")).click();
		Thread.sleep(10000);
		
		
		
	}
	
	//*******The system should have settings to pause/stop the crawling of keywords or profiles

	@Test(priority = 6)
	public void pausedeleteautocrawls() throws InterruptedException {
		
		driver.findElement(By.cssSelector("div.sprite.collection-icon")).click();
		Thread.sleep(25000);
		System.out.print(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("a.btn.btn-label-primary.btn-sm.btn-bold.mr-2")).click();
		driver.findElement(By.name("txtSearch")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/button[4]")).click();
	}

	//**********Solution should have Proxy management section for adding a Proxy. 

	@Test(priority = 7)
	public void collection() throws InterruptedException {
		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(25000);
		driver.findElement(By.name("txtSearch")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button"))
				.sendKeys(Keys.ENTER, Keys.ARROW_UP, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-primary"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtSearch")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button"))
				.sendKeys(Keys.ENTER, Keys.ARROW_UP, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-primary"))
				.click();
		Thread.sleep(10000);

	}
	// *****Solution should have Proxy management section for adding a Proxy ******

	@Test(priority = 8)
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

		// ****For Whatsapp: For the provided Whatsapp mobile phone, system should
		// ingest data from whatsapp groups and show the results ***
	}

	@Test(priority = 9)
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

		// ********* Group ANalysis **********

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[9]/label")).click();
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

	@Test(priority = 10)
	public void ingestdatafromtelegramgroups() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ulEntifilSource\"]/li[10]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div#calmBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[8]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a#twReport")).click();
		Thread.sleep(10000);
		System.out.println("Report Need to be Implement from dev");
		driver.findElement(By.xpath("//*[@id=\"twDashboard\"]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/i")).sendKeys(Keys.TAB,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN);
		Thread.sleep(10000);
	}

//***************Support for scheduling scraping periods and frequencies****************
	@Test(priority = 11)

	public void Addcllection() throws InterruptedException, AWTException {
		driver.get(
				"http:/server.authshieldserver.com:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[1]/div/div/div[2]/div/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("InnefuTest");
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("Modi");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div")).click();
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click();
		Thread.sleep(10000);
	}

//*********************************System has a provision to monitor people profiles in specific websites*************S
	@Test(priority = 12)

	public void monitorpeopleprofile() throws InterruptedException, AWTException {

		driver.get(
				"http://192.168.2.193:8081/nginnsight/#/collection/collection-list?loginId=207&role=A");
		Thread.sleep(10000);
		driver.findElement(By.name("txtSearch")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/span[2]/i"))
				.click();
		Thread.sleep(3000);

		String ID = driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[2]/td/mat-tab-group/div/mat-tab-body[1]/div/table/tr[2]/td[3]"))
				.getText();
		System.out.println(ID);
		Thread.sleep(2000);
		driver.get("http://192.168.2.193:8081/innsight/login_validateCredential");

		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblNewsCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingfour\"]/h4/a/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkPrflModalBox\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"spnProfileTwitterSrc\"]/label/span")).click();
		// driver.findElement(By.cssSelector("input#txtSrchProfile")).sendKeys(ID);
		System.out.println("Here data from particular ID is not coming so showing general data till get resolved");
		Select category = new Select(driver.findElement(By.cssSelector("select#searchProfileCategoryId")));
		category.selectByValue("general");

		driver.findElement(By.xpath("//*[@id=\"btnSrchProfile\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profileSrchModal\"]/div/div/div[4]/div/span[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();

		Thread.sleep(10000);

	}



//**************The solution should display the data from the news sources. The resulting data should contain the most recent news article.



@Test(priority=13)
public void displaythedatafromthenewssources() throws InterruptedException
{

driver.get("http://164.52.200.51:8080/innsight-cloud/");
Thread.sleep(10000);
driver.findElement(By.cssSelector("input#mat-input-0")).sendKeys("admin");
driver.findElement(By.cssSelector("input#mat-input-1")).sendKeys("admin@123");
driver.findElement(By.cssSelector("input#mat-input-1")).sendKeys(Keys.ENTER);

driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-2\"]/span[1]/mat-panel-title/span")).click();

driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-2\"]/div/ul/li[2]/button")).click();
driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-list-news-source/section/div/div/div[1]/div/div/div[2]/div/a")).click();
driver.findElement(By.cssSelector("input#mat-input-3")).sendKeys("Times of India");
driver.findElement(By.cssSelector("div#mat-select-value-9")).click();
driver.findElement(By.xpath("//*[@id=\"mat-option-680\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"mat-radio-3\"]/label")).click();
driver.findElement(By.cssSelector("input#mat-input-4")).sendKeys("https://timesofindia.indiatimes.com/rssfeedstopstories.cms");
driver.findElement(By.xpath("//*[@id=\"mat-select-value-13\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"mat-option-688\"]/span")).click();
driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-add-news-source/section/div/div/div[2]/div/form/div[4]/div[3]/button/span[1]")).click();
driver.findElement(By.xpath("/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-add-news-source/section/div/div/div[2]/div/form/div[5]/button[1]/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click();

driver.get("http://192.168.2.193:8081/innsight/");
driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("span#lblCheckUnCheckAll")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"ClNewAnalysis\"]/div/div[2]/div/div[4]/div[1]/span/label[2]")).click();
driver.findElement(By.xpath("//*[@id=\"newsfeedSourceDiv\"]/span[2]")).click();
driver.findElement(By.xpath("//*[@id=\"tblSearchNewsSrcMdl\"]/tbody/tr[3]/td[1]/label/span")).click();
driver.findElement(By.xpath("//*[@id=\"searchNewsSourceModal\"]/div/div[2]/button")).click();
driver.findElement(By.xpath("//*[@id=\"searchNewsSourceModal\"]/div/div[1]/div[1]/button")).click();
driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/span/a[1]")).click();
Thread.sleep(10000);
driver.findElement(By.cssSelector("a#twDashboard")).click();
Thread.sleep(10000);
}
}


























