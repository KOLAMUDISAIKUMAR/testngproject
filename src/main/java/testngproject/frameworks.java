package testngproject;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameworks {
  @Test
  public void f() throws Exception {
	  FileInputStream file=new FileInputStream("C:\\eclipse-workspace\\testngproject\\src\\test\\resources\\Book.xlsx");
	  
	 Workbook wb=WorkbookFactory.create(file);
	 Sheet stage=wb.getSheet("Sheet1");
	 String username=stage.getRow(1).getCell(0).getStringCellValue();
	 String password=stage.getRow(1).getCell(0).getStringCellValue();
	 //openbrowser
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 
  }
}
