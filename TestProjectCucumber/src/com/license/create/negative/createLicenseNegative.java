package com.license.create.negative;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class createLicenseNegative {

    @Given("^User has permission to add licensekey$")
    public void user_has_permision_to_add_licensekey() throws Throwable {
    	System.out.println("User has permision to add licensekey");
    }

    @Given("^User creates license with (.+) value (.+)$")
    public void user_creates_license_with_(String licencename, String value) throws Throwable {
    	System.out.format("User creates license with %s value %s", licencename, value);
    }

    @Then("^User gets error error message (.+) with (.+)$")
    public void user_gets_error_error_massage_with(String errormessage, String errorcode) throws Throwable {
    	System.out.format("User gets error error message %s with %s", errormessage, errorcode);
    }

    @And("^There is vendor of license created$")
    public void there_is_vendor_of_license_created() throws Throwable {
    	System.out.println("There is vendor of license created");
    }

    @And("^There are products of this vendor supported for license created$")
    public void there_are_products_of_this_vendor_supported_for_license_created() throws Throwable {
    	System.out.println("There are products of this vendor supported for license created");
    }

}