package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
	
	public static void main(String[]args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\ialmu\\eclipse-workspace\\com.nopcommerce.demo\\src\\test\\resources\\configfiles\\config.properties"); //object
		
		Properties property = new Properties(); //object
		property.load(file); //Load property file
		
		System.out.println(property.getProperty("browser"));
	}
}
