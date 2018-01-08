@Negative
Feature: Validate cases of list licenses with wrong payload

  Background: 
    Given User has permission to add licensekey
      And There is vendor of license created
      And There are products of this vendor supported for license created
  
  Scenario Outline: Add License to the pool with boolean values in fields
  
    Given User creates license with <fieldName> value <value>
     Then User gets error error message <errorMessage> with <errorCode>
  
    Examples: 
      | fieldName   | value  | errorCode | errorMessage                 | 
      | licenceName | "true" | 1420500   | "Unexpected error occurred." | 
      | description | "true" | 1420500   | "Unexpected error occurred." | 
      | key         | "true" | 1420500   | "Unexpected error occurred." | 
      | usage_type  | "true" | 1420500   | "Unexpected error occurred." | 
      | usage_limit | "true" | 1420500   | "Unexpected error occurred." | 

      
#Negative: Add License to the pool with
#1. without mandatory fields
#2. wrong data in fields
#3. already existing license name in active status
#3a. already existing license name in suspended status
#4. when user has not enough permissions
#5. not existing usage_type value
#6. wrong usage_limit value
#7. null values in fields
#8. boolean values in fields
#9. wrong combination of values in usage_type and usage_limit:
#"usage_type": "limited" and "usage_limit": 0
#"usage_type": "limited" and "usage_limit": -1
#"usage_type": "limited" and "usage_limit": -2147483647
#"usage_type": "unlimited" and "usage_limit": 1
#"usage_type": "unlimited" and "usage_limit": -1
#"usage_type": "unlimited" and "usage_limit": -2147483647
#{
#    "name": "length > 255" | "length = 0" | null | true | false,
#    "description": "length > 255" | "length = 0" | null | true | false,
#    "key": "length > 255" | "length = 0" | null | true | false,
#    "usage_type": "OK"| "restricted" | null | true | false,
#    "usage_limit": -1 | 256 | 0.00000009 | null | true | false