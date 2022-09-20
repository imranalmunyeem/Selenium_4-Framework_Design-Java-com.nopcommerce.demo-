package com.nopcommerce.demo.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.BaseTest;

public class LoginPagePF extends BaseTest{
	    // Email Locator
		@FindBy(how = How.ID, using = "Email")
		@CacheLookup
		WebElement txtEmail;

		// Password Locator
		@FindBy(how = How.ID, using = "Password")
		@CacheLookup
		WebElement txtPassword;

		// Button Locator
		@FindBy(how = How.XPATH, using = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
		@CacheLookup
		WebElement btnLogin;

		// login module in one method
		public void loginToAdmin(String sendEmail, String sendPassword) {
			txtEmail.clear();
			txtEmail.sendKeys(sendEmail);
			txtPassword.clear();
			txtPassword.sendKeys(sendPassword);
			btnLogin.click();

		}

	}
	