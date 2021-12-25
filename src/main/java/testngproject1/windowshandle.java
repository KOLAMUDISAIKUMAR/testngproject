package testngproject1; 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager; 
public class windowshandle { 
@Test	
public void main() throws InterruptedException { 
WebDriverManager.chromedriver().setup();  
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize(); 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.officedepot.com/");
driver.findElement(By.xpath("//div[@class='od-col od-col-gutter']//a[@class='od-menu-link'][normalize-space()='Credit Cards']")).click();
driver.findElement(By.xpath("//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']")).click();
// all windows id 
Set<String> allwindows = driver.getWindowHandles();
// windowscount and allwindows id
System.out.println("windowscount:"+ allwindows.size());
 //switch too child window
List<String>windows=new ArrayList<String>(allwindows);
driver.switchTo().window(windows.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='applyprox_businessname']")).sendKeys("mobiles");
	}
}