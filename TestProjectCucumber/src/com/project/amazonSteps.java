package com.project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class amazonSteps {

    @Given("^I login to my amazon account$")
    public void loginAmazonAccount() {
        System.out.println("I login to my amazon account");
    }

    @And("^I do not have items in my cart$")
    public void noItemsInMyCart(){
        System.out.println("I do not have items in my cart");
    }

    @When("^I perform procedure of checkout$")
    public void checkoutProcedure(){
        System.out.println("I perform procedure of checkout");
    }

    @Then("^I get error \"([0-9]{3,})\"$")
    public void getError(int errorCode){
        System.out.format("I get error %d%n", errorCode);
    }

    @And("^I add \"([0-9]{1,3})\" item to the cart$")
    public void addItemToCart(int nItems) {
        System.out.format("I add %d%n item to the cart", nItems);
    }

    @Then("^Checkout shows \"([0-9]{1,3})\" item$")
    public void nItemsInCart(int nItems){
        System.out.format("I get error %d%n", nItems);
    }
}