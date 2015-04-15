package edu.arizona.kra.aft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import edu.arizona.kra.aft.Configurable;

public class CasPageImpl implements CasPage {
	
	static final String USERNAME_ELEMENT_ID = "username";
	static final String PASSWORD_ELEMENT_ID = "password";

	@Autowired
	private WebDriver browser;
	
	@Autowired
	private Configurable config;
	
	public void login() {
		browser.get(config.getApplicationUrl());
		String currentUrl = browser.getCurrentUrl();
		if ( currentUrl.contains("webauth.arizona.edu") ) {
			WebElement userNameElement = browser.findElement(By.id(USERNAME_ELEMENT_ID));
			WebElement passwordElement = browser.findElement(By.id(PASSWORD_ELEMENT_ID));
			
			String username = config.getCasUsername();
			String password = config.getCasPassword();
			
			userNameElement.sendKeys(username);
			passwordElement.sendKeys(password);
			
			browser.findElement(By.name("submit")).click();
			
		}
	}
}
