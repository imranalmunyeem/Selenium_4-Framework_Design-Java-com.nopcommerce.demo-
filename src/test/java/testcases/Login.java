package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Login extends BaseTest {
	
	@Test
	public void LoginTest() {
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.clear();
		emailField.sendKeys("admin@yourstore.com");
		
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.clear();
		passwordField.sendKeys("admin");
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		loginButton.click();
	}
}
