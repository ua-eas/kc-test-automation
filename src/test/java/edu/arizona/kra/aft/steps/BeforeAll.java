package edu.arizona.kra.aft.steps;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.annotation.Before;
import edu.arizona.kra.aft.pages.CasPage;

public class BeforeAll {
	
	@Autowired
	protected CasPage casPage;
	
	@Before 
	public void beforeAll() {
		
		
		casPage.login();
	}
}
