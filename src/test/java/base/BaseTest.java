package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
		public static WebDriver driver;
		public static Properties property = new Properties();
		public static FileReader fr;
		public static Logger logger;
		
		@BeforeClass
		public void setUp() throws IOException {
			logger = Logger.getLogger("Nopcommerce");
			PropertyConfigurator.configure("Log4j.properties");
			
			if(driver==null) {
				FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
				property.load(fr);
			}
			
			if(property.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup(); //base
				driver = new ChromeDriver(); //base
				driver.get(property.getProperty("testurl")); // from property file				
			}
			
			if(property.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup(); //base
				driver = new FirefoxDriver(); //base
				driver.get(property.getProperty("testurl")); // from property file				
			}
			
			if(property.getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup(); //base
				driver = new EdgeDriver(); //base
				driver.get(property.getProperty("testurl")); // from property file				
			}
			
			if(property.getProperty("browser").equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup(); //base
				driver = new OperaDriver(); //base
				driver.get(property.getProperty("testurl")); // from property file				
			}	
		}
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
	}