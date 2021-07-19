package CAIRObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CAIRDashboardPage {

	WebDriver driver;

	@FindBy(id = "twDashboard")
	WebElement DashBoardButton;
	@FindBy(id = "twColrelate")
	WebElement Articles;
	@FindBy(id = "twUsers")
	WebElement Author;
	@FindBy(id = "twGeo")
	WebElement Map;
	@FindBy(id = "twMedia")
	WebElement Media;
	@FindBy(id = "twReport")
	WebElement Report;

	// ***************************Save Analysis
	// Elements***********************************

	@FindBy(id = "idSaveSearch")
	WebElement Save;
	@FindBy(id = "srchname")
	WebElement SetAnalysisName;
	@FindBy(id = "txtSnapShot")
	WebElement SetSnapshotName;
	@FindBy(id = "txtDescriptionCase")
	WebElement SetDescription;
	@FindBy(xpath = "//*[@id=\"sveSrchFLtr\"]/div/div/div[3]/button[1]")
	WebElement SaveAnalysisButton;
	@FindBy(xpath = "//*[@id=\"spnYes\"]")
	WebElement SaveAnalysisconfirmAlert;

	@FindBy(xpath = "//*[@id=\"widget_dashboard_60-1\"]/div[2]/div/span")
	WebElement TOPLANGUAGES;
	@FindBy(xpath = "//*[@id=\"widget_dashboard_3-1\"]/div[2]/div[1]/span")
	WebElement TOPIMAGES;
	@FindBy(xpath = "//*[@id=\"widget_dashboard_4-1\"]/div[2]/div/span")
	WebElement TOPURLS;

	@FindBy(xpath = "//*[@id=\"widget_dashboard_86-1\"]/div[2]/div[1]/span")
	WebElement HOURLYACTIVITYCOUNT;
	@FindBy(xpath = "//*[@id=\"widget_dashboard_9-1\"]/div[2]/div/span")
	WebElement ORG;

	public CAIRDashboardPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement DashBoardButton() {
		return DashBoardButton;

	}

	public WebElement Articles() {
		return Articles;

	}

	public WebElement Author() {
		return Author;

	}

	public WebElement Map() {
		return Map;

	}

	public WebElement Media() {
		return Media;

	}

	public WebElement Report() {
		return Report;

	}

	public WebElement Save() {
		return Save;

	}

	public WebElement TOPLANGUAGES() {
		return TOPLANGUAGES;

	}

	public WebElement TOPIMAGES() {
		return TOPIMAGES;

	}

	public WebElement TOPURLS() {
		return TOPURLS;
	}

	public WebElement HOURLYACTIVITYCOUNT() {
		return HOURLYACTIVITYCOUNT;

	}

	public WebElement ORG() {
		return ORG;

	}

	public WebElement SetAnalysisName() {
		return SetAnalysisName;

	}

	public WebElement SetSnapshotName() {
		return SetSnapshotName;

	}

	public WebElement SetDescription() {
		return SetDescription;
	}

	public WebElement SaveAnalysisButton() {
		return SaveAnalysisButton;

	}

	public WebElement SaveAnalysisconfirmAlert() {
		return SaveAnalysisconfirmAlert;

	}

}
