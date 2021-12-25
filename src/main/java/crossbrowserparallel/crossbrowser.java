package crossbrowserparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			// Open browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}

}

}