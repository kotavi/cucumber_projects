package com.license.delete.positive.withAnt;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class deleteLicense {
	
	@Before
	public void createUser(){
		System.out.println("Here we create User before scenario started");
	}
	
	@After
	public void deleteUser(){
		System.out.println("Here we delete User after scenario finished");
	}

    @Given("^User has permission to delete license$")
    public void user_has_permission_to_delete_license() throws Throwable {
    	System.out.println("User has permission to delete license");
    }

    @Given("^There is license in Active status$")
    public void there_is_license_in_active_status() throws Throwable {
    	System.out.println("There is license in Active status");
    	System.out.println("-----Creating new license---------");
    	System.out.println("-----Checking that license has Active status---------");
    }

    @Given("^There is license in Suspended status$")
    public void there_is_license_in_suspended_status() throws Throwable {
    	System.out.println("There is license in Suspended status");
    	System.out.println("-----Creating new license---------");
    	System.out.println("-----Sending request to suspend license---------");
    	System.out.println("-----Checking that license has Suspended status---------");
    }

    @Given("^There is license which is allocated for VNF$")
    public void there_is_license_which_is_allocated_for_vnf() throws Throwable {
    	System.out.println("There is license which is allocated for VNF");
    	System.out.println("-----Creating new license---------");
    	System.out.println("-----Creating new VNF---------");
    	System.out.println("-----Allocate license for VNF---------");
    }

    @When("^User sends delete request to delete the license$")
    public void user_sends_delete_request_to_delete_the_license() throws Throwable {
    	System.out.println("User sends delete request to delete the license");
    }

    @Then("^HTTP return status should be (\\d+)$")
    public void http_return_status_should_be_200(int arg1) throws Throwable {
    	System.out.format("HTTP return status should be %d", arg1);
    }

}