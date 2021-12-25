package testngproject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testngproject.BaseClass;

public class takescreenshots extends BaseClass{
	
	@Test
	public void takeScreenshot() throws IOException {
		
		//startBrowser("chrome");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/in/english/");
		
		//initialize ref var and convert driver to take screenshot interface --type casting
		TakesScreenshot capture = ((TakesScreenshot)driver);
		
		// capture screenshot
		File source = capture.getScreenshotAs(OutputType.FILE);
		
		// provide destination where screensot will be saved.
		String path ="C:\\eclipse-workspace\\testngproject\\src\\test\\resources\\screenshots";
		File destFile = new File(path+"\\screenshots.png");
		
		FileUtils.copyFile(source, destFile);
	}

}

