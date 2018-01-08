@Smoke @Sanity
Feature: Check my amazon cart

  Scenario: Amazon cart is empty
    Given I login to my amazon account
      And I do not have items in my cart
     When I perform procedure of checkout
     Then I get error "404"
  
  Scenario Outline: Amazon cart has one item
    Given I login to my amazon account
      And I add "<Added_items>" item to the cart
     When I perform procedure of checkout
     Then Checkout shows "<Checkout_items>" item
  
    Examples: 
      | Added_items | Checkout_items | 
      | 1           | 1              | 
      | 10          | 10             | 
      | 100         | 100            | 
  
