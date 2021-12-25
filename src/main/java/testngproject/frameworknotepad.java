package testngproject;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class frameworknotepad {
  @Test
  public String readproperty(String propertyvalue) throws Exception {
	  FileInputStream file= new FileInputStream("C:\\eclipse-workspace\\testngproject\\src\\test\\resources\\New Text Document.txt");
	Properties prop = new Properties();
	prop.load(file);
	String value=prop.getProperty(propertyvalue);
	return value;

	  
  }
}
