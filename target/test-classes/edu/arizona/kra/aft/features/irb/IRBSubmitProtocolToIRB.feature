Feature: Submit Protocols for Review
       As an IRB Administrator,
       I want to add new protocols that have been submitted to the IRB Office
       so that I can make it ready for IRB Review


Scenario: Submit Expedited IRB Protocol with Valid Required Information
       Given I am logged in as an IRB Administrator
       When I create an IRB Protocol 
       And I add all of the required fields
       And I submit the protocol with an Expedited review type
       Then a new protocol document should be created
       And the document status should be Submitted to IRB
       And the submission status should be Submitted to Committee
 
Scenario: Submit Expedited IRB Protocol Missing Required Information
       Given I am logged in as an IRB Administrator
       When I create an IRB Protocol 
       And miss one of the required fields
       And I submit the protocol with an Expedited review type
       Then  an error should appear saying the field is required