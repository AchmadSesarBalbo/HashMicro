Feature: Sauce Demo E-Commerce Flow

  Scenario: User can login and checkout product
    Given user is on SauceDemo login page
    When user logs in with valid credentials
    And user adds the first product to cart
    And user opens the cart page
    And user clicks checkout button
    Then user should be redirected to checkout page