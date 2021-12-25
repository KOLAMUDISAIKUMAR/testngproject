package testngproject1; 
import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class windowshandlwnewtab { 
public static void main(String[] args) { 
FirefoxDriver driver = new FirefoxDriver(); 
driver.manage().window().maximize(); 
driver.get("http://www.bing.com/"); 
//To get the window handle of the current window 
String parent=driver.getWindowHandle(); 
driver.findElement(By.linkText("Office Online")).click(); 
//To get the window handle of all the current windows. 
Set<String> winId=driver.getWindowHandles(); 
int WinCount=winId.size();
List<String>windows=new ArrayList<String>(winId);
driver.switchTo().window(windows.get(1));
String Url=driver.getCurrentUrl();
} 
} 

