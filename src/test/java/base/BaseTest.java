package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;  //initialize driver
	public static Properties property = new Properties();  //property object
	public static FileReader file;     //file reader object
	
	@BeforeTest  //will run before all the test
	public void setUp() throws IOException {
		if(driver==null) {
			FileReader file = new FileReader("C:\\Users\\ialmu\\eclipse-workspace\\com.nopcommerce.demo\\src\\test\\resources\\configfiles\\config.properties"); //read the file
			property.load(file);   //load the property file
		}
		
		if(property.getProperty("browser").equalsIgnoreCase("chrome")) { //equalsIgnoreCase will ignore lower case or upper case typing mistake for browser names
			WebDriverManager.chromedriver().setup(); //base
			driver = new ChromeDriver();   //base
			driver.get(property.getProperty("testurl"));
		}
		
		else if(property.getProperty("browser").equalsIgnoreCase("firefox")) { //equalsIgnoreCase will ignore lower case or upper case typing mistake for browser names
			WebDriverManager.firefoxdriver().setup(); //base
			driver = new FirefoxDriver();   //base
			driver.get(property.getProperty("testurl"));
		}
		
		else if(property.getProperty("browser").equalsIgnoreCase("edge")) { //equalsIgnoreCase will ignore lower case or upper case typing mistake for browser names
			WebDriverManager.edgedriver().setup(); //base
			driver = new EdgeDriver();   //base
			driver.get(property.getProperty("testurl"));
		}
		
		else if(property.getProperty("browser").equalsIgnoreCase("opera")) { //equalsIgnoreCase will ignore lower case or upper case typing mistake for browser names
			WebDriverManager.operadriver().setup(); //base
			driver = new OperaDriver();   //base
			driver.get(property.getProperty("testurl"));
		}
	}
	
	@AfterTest  //will run after all the test
	public void tearDown() {
		driver.close();
		System.out.println("Teardown is successful");
	}
}