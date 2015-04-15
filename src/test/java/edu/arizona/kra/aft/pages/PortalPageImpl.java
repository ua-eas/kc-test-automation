package edu.arizona.kra.aft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import edu.arizona.kra.aft.Configurable;

public class PortalPageImpl implements PortalPage {
	
	@Autowired
	private Configurable config;
	
	@Autowired
	protected WebDriver browser;
	
	private static final String BACKDOOR_ID = "backdoorId";
	private static final String BACKDOOR_FORM = "BackdoorForm";
	
	@FindBy(how = How.NAME, using = BACKDOOR_ID)
	public WebElement backdoorId;
	
	@FindBy(how = How.NAME, using = BACKDOOR_FORM)
	public WebElement backdoorForm;
	
	public void backdoorAs(String user) {
		backdoorId.sendKeys(user);
		backdoorForm.submit();
	}

	public void navagateToCentralAdmin() {
		String adminPageURL = config.getApplicationUrl() + "/portal.do?selectedTab=portalCentralAdminBody";
		browser.get(adminPageURL);
		PageFactory.initElements(browser, this);
	}
}
