package edu.arizona.kra.aft.steps;

import cucumber.annotation.Before;
import cucumber.annotation.en.*;
import cucumber.runtime.PendingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import edu.arizona.kra.aft.pages.PortalPage;
import edu.arizona.kra.aft.pages.PortalPageImpl;

public class IRBSubmitProtocolToIRBSteps {
	
	protected static final String IRB_ADMINISTRATOR = "andienci";
	
	@Autowired
	protected WebDriver browser;
	
	@Autowired
	protected PortalPage portalPage;
	
	@Given("^I am logged in as an IRB Administrator$")
	public void I_am_logged_in_as_an_IRB_Administrator() throws Throwable {
	    
		portalPage.navagateToCentralAdmin();
		portalPage.backdoorAs(IRB_ADMINISTRATOR);
		
	}

	@When("^I create an IRB Protocol$")
	public void I_create_an_IRB_Protocol() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I add all of the required fields$")
	public void I_add_all_of_the_required_fields() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I submit the protocol with an Expedited review type$")
	public void I_submit_the_protocol_with_an_Expedited_review_type() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^a new protocol document should be created$")
	public void a_new_protocol_document_should_be_created() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the document status should be Submitted to IRB$")
	public void the_document_status_should_be_Submitted_to_IRB() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the submission status should be Submitted to Committee$")
	public void and_the_submission_status_should_be_Submitted_to_Committee() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^miss one of the required fields$")
	public void miss_one_of_the_required_fields() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^an error should appear saying the field is required$")
	public void an_error_should_appear_saying_the_field_is_required() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
