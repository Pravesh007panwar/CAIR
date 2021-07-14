package ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverBase {
public WebDriver driver;
	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\CAIR\\src\\main\\java\\BrowserName.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		}

		else if (browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			
			driver = new InternetExplorerDriver();

		}
		return driver;
	}
}