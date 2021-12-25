package testngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver=null;
	
	public void openBrowsers(String browser) {
		if (browser.equalsIgnoreCase("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
		}else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			     driver= new FirefoxDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
			}else 
				if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
			     driver= new EdgeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");

				
			}
	}
	
	
	public void wait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		

}
}