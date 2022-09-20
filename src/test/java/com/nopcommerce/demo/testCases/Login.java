package com.nopcommerce.demo.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nopcommerce.demo.pageFactory.LoginPagePF;
import com.nopcommerce.demo.pageObject.LoginPagePO;

import base.BaseTest;

public class Login extends BaseTest {

	@Test
	public void LoginTest() {
		// Approach 1 - Page Factory
//		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);
//		login.loginToAdmin("admin@yourstore.com", "admin");

		// Approach 2- Page Object pattern
		LoginPagePO loginpagepo = new LoginPagePO();
		loginpagepo.enterEmail("admin@yourstore.com");
		loginpagepo.enterPassword("admin");
		loginpagepo.clickOnLogin();
		
		// Approach 3 - External Property file
//      WebElement emailField = driver.findElement(By.id(locators.getProperty("email_field"))); //coming from locators.properties file
//		emailField.clear();
//		emailField.sendKeys("admin@yourstore.com");

//		WebElement passwordField = driver.findElement(By.id(locators.getProperty("password_field"))); ////coming from locators.properties file
//		passwordField.clear();
//		passwordField.sendKeys("admin");

//		WebElement loginButton = driver.findElement(By.xpath(locators.getProperty("login_button"))); ////coming from locators.properties file
//		loginButton.click();

	}
}
