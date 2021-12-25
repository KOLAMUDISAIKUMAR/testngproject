package testngproject;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.PropertySetFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class propertiesfile {
  @Test
  public void properties() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("");
	  
			  
  }
}
