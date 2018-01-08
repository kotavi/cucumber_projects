@Positive
Feature: Get list of licenses added to license pool

Successfully delete license in active or suspended statuses

Requirements:
- User can delete license when User has permission to delete license
- User can delete license when there is license in Active or Suspended status

  Background: 
    Given User has permission to delete license
  
  Scenario: User can successfully delete license in Active status
    Given There is license in Active status
     When User sends delete request to delete the license
     Then HTTP return status should be 200
  
  Scenario: User can successfully delete license in Suspended status
    Given There is license in Suspended status
     When User sends delete request to delete the license
     Then HTTP return status should be 200
  
  Scenario: User can successfully delete license license that is allocated for VNF
    Given There is license which is allocated for VNF
     When User sends delete request to delete the license
     Then HTTP return status should be 200
  
