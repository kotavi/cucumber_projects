@Positive
Feature: Get list of licenses added to license pool

It should be possible to add licensekey to license pool for a particular vendor in order to be applied for particular products

  Background: 
    Given User has permission to add licensekey
      And There is vendor of license created
      And There are products of this vendor supported for license created
  
  Scenario: User can retreive licenses that he has permision to
  
    Given User of customer1 creates license
      | name       | description        | key     | usage_type | usage_limit | 
      | "Lisence1" | "This is license1" | "key-1" | limited    | 1           | 
      | "Lisence2" | "This is license2" | "key-2" | limited    | 2147483647  | 
      | "Lisence3" | "This is license3" | "key-3" | unlimited  | 0           | 
     When User of customer1 requests all licenses
     Then User gets 3 license in response payload
      And Created license id matches to license id from response payload
  
