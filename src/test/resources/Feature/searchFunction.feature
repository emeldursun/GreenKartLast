Feature: search box testing


#  Check that when the user types any (Number / Text /Special Char ) in the search box.
#  Check that when the user pastes in the search box.
#  Check whether the user is able to copy typed text from the search box or not.
#  Verify the placeholder for the search box.
#  Without entering anything in the search box click on the Search button.
#  Check the cross or cancel option to clear the search keyword
#  Enter any one character in the search box and click on the Search button/press Enter key.
#  Enter only special characters in the search field and click on the Search button.
#  Enter only numbers in the search field and click on the Search button
#  Enter alphanumeric characters in the search box and click on the Search button
#  Enter alphanumeric characters and special characters and click on the search button.
#  Enter string more than the max char limit of the search field.
#  Enter a string in the search box with spaces (before the string, after the string, and in between) and verify the results.
#  Verify this on all pages where the Search box is available
#  Try to drag and drop images or another file in the search box and check the result
#  Check if the search is applied on the watermark updated in the search box
#  Check whether the auto-suggestion is working or not

  Background: User navigates to the link
    Given user navigates to the link
    When User clicks on search box

  Scenario: User should be able to type or enter in the search box.

    When User enters random characters in the search box.
    Then User will be able to type in the search box.

  Scenario: User should be able to search field and press Enter key.

    When User enters a random product name
    And User presses Enter key.
    Then User will be able to find that product.

@wip
  Scenario: User should be able to see the typed text properly.

    When User enters random characters in the search box.
    Then User will be able to see the typed letters in the search box.


  Scenario: User should be able to copy typed text from the search box.
    When User enters random characters in the search box.
    And User copies the text from the search box.
    Then User will be able to copy typed text from and paste it to the search box.

  Scenario: The placeholder at the search box should be "Search for Vegetables and Fruits".
    Then Verify that the placeholder at the search box should be "Search for Vegetables and Fruits".

  @wip
  Scenario: User should be able to see the auto-suggestion after typing letters in the search box.

    Given user types "c" in the search box
    When user gets all the list of products
    Then user will see the product results containing letter


  Scenario: User should be able to search and find a product
    Given User clicks on search box
    When User enters a random product
    Then User will be able to find that product.

