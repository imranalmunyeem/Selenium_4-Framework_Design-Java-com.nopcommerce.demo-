package com.nopcommerce.demo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class LoginPagePO extends BaseTest {
		// Email Locator
		By emailID = By.id("Email");
		
		// Password Locator
		By passwordID = By.id("Password");
		
		// Button Locator
		By loginButton = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
		
		
		//Method to enter email
		public void enterEmail(String email) {
			WebElement emailField = driver.findElement(emailID);
			emailField.clear();
			emailField.sendKeys(email);
		}

		//Method to enter password
		public void enterPassword(String password) {
			WebElement passwordField = driver.findElement(passwordID);
			passwordField.clear();
			passwordField.sendKeys(password);
		}
		
		public void clickOnLogin() {
			driver.findElement(loginButton).click();
		}
		


	}