package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Login extends BaseTest {
	
	@Test
	public void LoginTest() {
		WebElement emailField = driver.findElement(By.id(locators.getProperty("email_field"))); //coming from locators.properties file
		emailField.clear();
		emailField.sendKeys("admin@yourstore.com");
		
		WebElement passwordField = driver.findElement(By.id(locators.getProperty("password_field"))); ////coming from locators.properties file
		passwordField.clear();
		passwordField.sendKeys("admin");
		
		WebElement loginButton = driver.findElement(By.xpath(locators.getProperty("login_button"))); ////coming from locators.properties file
		loginButton.click();
	}
}
