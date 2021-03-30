Feature: Create User & Login

  Scenario Outline: Creating a user and logging in
    Given I can get to the add user page
    And we input the <username> and <password> into the fields
    When A <username> and <password> is created
    And I verify that the login has been created
    Then assert the login works

    Examples: 
      | username | password |
      | jordan   | football |
      | nancy    | tennis   |
