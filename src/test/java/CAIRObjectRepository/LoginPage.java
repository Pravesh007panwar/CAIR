package CAIRObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	By userName = By.name("userName");
	By Password = By.className("password");
	By Login = By.className("loginbtn");
	By Title = By.cssSelector("div.logo.logo-postion");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement setusername() {
		return driver.findElement(userName);

	}

	public WebElement setPassword() {
		return driver.findElement(Password);

	}

	public WebElement clickLogin() {
		return driver.findElement(Login);

	}

	public WebElement Title() {
		return driver.findElement(Title);

	}

	public String loginurl() {

		String URL = "http://office.authshieldserver.com:8081/innsight/login_validateCredential";
		return URL;
	}

	public String username() {

		String username = "pravesh";
		return username;

	}

	public String password() {

		String password = "Pravesh@3210#";
		return password;

	}

}
