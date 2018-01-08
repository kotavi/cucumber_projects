package com.license.create.positive;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class createLicense {
	
	public class LicensePayload {
		public String name;
		public String description;
		public String key;
		public String usage_type;
		public Integer usage_limit;
		
		public LicensePayload(String licenseName, String licenseDescription,
				String licenseKey, String licenseUsageType, 
				Integer licenseUsageLimit){
			name = licenseName;
			description = licenseDescription;
			key = licenseKey;
			usage_type = licenseUsageType;
			usage_limit = licenseUsageLimit;
		} 
	}

    @Given("^User has permission to add licensekey$")
    public void user_has_permision_to_add_licensekey() throws Throwable {
    	System.out.println("User has permision to add licensekey");
    }

    @Given("^User of customer1 creates license$")
    public void user_of_customer_1_creates_license(DataTable table) throws Throwable {
    	System.out.println("User of customer 1 creates license");
//    	List<List<String>> data = table .raw();
//    	System.out.println("This is data from table " + data.get(0).get(0).toString());
//    	System.out.println("This is data from table " + data.get(0).get(1).toString());
    	
    	// Create an ArrayList
    	List<LicensePayload> payloads = new ArrayList<LicensePayload>();
    	// Store all users
    	payloads = table.asList(LicensePayload.class);
    	
    	for (LicensePayload payload: payloads){
    		System.out.println("The license name is " + payload.name);
    		System.out.println("The license description is " + payload.description);
    		System.out.println("The license key is " + payload.key);
    		System.out.println("The license usage_type is " + payload.usage_type);
    		System.out.println("The license usage_limit is " + payload.usage_limit.toString());
    	}
    }

    @When("^User of customer1 requests all licenses$")
    public void user_of_customer_1_requests_all_licenses() throws Throwable {
    	System.out.println("User of customer 1 requests all licenses");
    }

    @Then("^User gets (\\d+) license in response payload$")
    public void user_gets_only_1_license_in_response_payload(int arg1) throws Throwable {
    	System.out.format("User gets %d license in response payload", arg1);
    }

    @And("^There is vendor of license created$")
    public void there_is_vendor_of_license_created() throws Throwable {
    	System.out.println("There is vendor of license created");
    }

    @And("^There are products of this vendor supported for license created$")
    public void there_are_products_of_this_vendor_supported_for_license_created() throws Throwable {
    	System.out.println("There are products of this vendor supported for license created");
    }

    @And("^Created license id matches to license id from response payload$")
    public void created_license_id_matches_to_license_id_from_response_payload() throws Throwable {
    	System.out.println("Created license id matches to license id from response payload");
    }

}
