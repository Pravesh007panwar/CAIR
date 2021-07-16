package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileManagerPage {

	WebDriver driver;

	@FindBy(xpath = "/html/body/app-root/app-profile-finder/main/mat-sidenav-container/mat-sidenav-content/div/section/div/div/div[1]/div/div/div[2]/div/a")
	WebElement SearchProfile;
	
	@FindBy(id = "mat-input-11")
	WebElement EnterName;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-profile-search/mat-dialog-content/div[2]/form/div[4]/button[1]")
	WebElement Searchinputprofile;
	

	public ProfileManagerPage(WebDriver driver) {

		this.driver = driver;
        PageFactory.initElements(driver, this);

	}

	public WebElement SearchProfile() {
		return SearchProfile;
		
	}

	public WebElement EnterName() {
		return EnterName;
		
	}
	
	
	public WebElement Searchinputprofile() {
		return Searchinputprofile;

	}

	
}
