Feature: Buy something

  Scenario: Shopping
    Given I can access a site
      | site                     |
      | https://www.amazon.co.uk |
      | https://www.ebay.co.uk   |
    When I search for clothes
      | clothes |
      | Jumpers |
      | Jeans   |
    Then I will buy something
