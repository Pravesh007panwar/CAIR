package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"cdk-accordion-child-0\"]/div/ul/li[2]/button")
	WebElement AddCollection;
	@FindBy(id = "mat-input-1")
	WebElement CollectionName;
	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")
	WebElement NextButton;

	@FindBy(xpath = "/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-accordion[1]/mat-expansion-panel[2]")
	WebElement ManageAvtarClick;

	@FindBy(xpath = "//*[@id=\"cdk-accordion-child-1\"]/div/ul/li[2]/button")
	WebElement AddAvtar;

	public CollectionPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement AddCollection() {
		return AddCollection;

	}

	public WebElement CollectionName() {
		return CollectionName;

	}

	public WebElement NextButton() {
		return NextButton;

	}

	public WebElement ManageAvtarClick() {
		return ManageAvtarClick;

	}

	public WebElement AddAvtar() {
		return AddAvtar;

	}
}