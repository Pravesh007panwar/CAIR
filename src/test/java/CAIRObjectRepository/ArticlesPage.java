package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlesPage {
	WebDriver driver;
	
	@FindBy(css = "span#lblNewsCheckUnCheckAll")
	WebElement CountryDeskUncheck;
	@FindBy(id = "lblCheckUnCheckAll")
	WebElement SocialMediaSourcesUncheck;
	
	@FindBy(xpath= ("//*[@id=\"ulEntifilSource\"]/li[4]/label/span"))
	WebElement Setinstagram;
	@FindBy(xpath= ("//*[@id=\"ulEntifilSource\"]/li[2]/label/span"))
	WebElement Setfacebook;
	@FindBy(xpath = "//*[@id=\"ulEntifilSource\"]/li[13]/label/span")
	WebElement SetWebSite;
	@FindBy(xpath = "//*[@id=\"headingTwo\"]/h4/span/a[1]")
	WebElement ClickApply;
	
	

	

	public ArticlesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement CountryDeskUncheck() {
		return CountryDeskUncheck;

	}

	public WebElement SocialMediaSourcesUncheck() {
		return SocialMediaSourcesUncheck;

	}

	public WebElement Setinstagram() {
		return Setinstagram;

	}

	public WebElement Setfacebook() {
		return Setfacebook;

	}

	public WebElement ClickApply() {
		return ClickApply;
	}
	

	public WebElement SetWebSite() {
		return SetWebSite;
	}
}
