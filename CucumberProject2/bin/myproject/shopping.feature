@Smoke @Sanity
Feature: Check my amazon cart

Scenario: Amazon cart is empty
Given I login to my amazon account
And I do not have items in my cart
When I perform procedure of checkout
Then I get error "404"

Scenario: Amazon cart has one item
Given I login to my amazon account
And I add "1" item to the cart
When I perform procedure of checkout
Then Checkout shows "1" item