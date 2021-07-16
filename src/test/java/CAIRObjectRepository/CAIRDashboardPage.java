package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CAIRDashboardPage {

	WebDriver driver;

	@FindBy(id = "twDashboard")
	WebElement DashBoard;
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
	@FindBy(id = "idSaveSearch")
	WebElement Save;

	public CAIRDashboardPage(WebDriver driver) {

		this.driver = driver;
        PageFactory.initElements(driver, this);

	}

	public WebElement DashBoard() {
		return DashBoard;
		
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
	
		
	}
	
	
