Feature: An example


  Scenario: Valid email RO
    Given I am on the main page
    When  the email value of "tester@test.ro" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: Email value 25 characters
    Given I am on the main page
    When  the email value of "AAaaaaaaaaaaaaaa" is inputted
    And   the submit button is clicked
    Then the email border goes red

  Scenario: Instructors button
    Given I am on the main page
    When I click on Instructors button
    Then our Instructors options appear

  Scenario: Read more button Selenium
    Given I am on the main page promotional section
    When  the read more button Selenium is clicked
    Then the Selenium page opens

  Scenario: Return to the top button
    Given I am on the main page
    When the return to the top button is clicked
    Then I return back to the top page

  Scenario: Start The Enrollment button
    Given I am on the main page
    When start The Enrollment button is clicked
    Then the Register page opens

  Scenario: Read more button Virtual
    Given I am on the main page
    When I click the read more button for virtual page
    Then the Virtual page opens

  Scenario: Read more button Hybrid
    Given I am on the main page
    When I click the read more button for the hybrid section
    Then the hybrid page opens

  Scenario: Read more button In Person
    Given I am on the main page
    When the In Person Read More button is clicked
    Then the In Person page opens

  Scenario: Valid fields from Register page
    Given I am on the Register page
    When the first name is inserted as "Silvia"
    And  the last name is inserted as "Mich"
    *    the username is inserted as "test.test"
    *    the password is inserted as "xxxxxx"
    *    the confirm password is inserted as "xxxxxx"
    * I can click on next
    Then the Contact Information page opens

  Scenario: Empty fields from Register page
    Given I am on the Register page
    When the first name is inserted as " "
    And the last name is inserted as " "
    * the username is inserted as " "
    * the password is inserted as " "
    * the confirm password is inserted as " "
    Then I am not allowed to click on next

  Scenario: Contact Information page
    Given I am on the Contact Information page
    When the email address is inserted as "mirela.mich@gmail.com"
    And the phone number is inserted as "0748465898"
    * the country is inserted as "Romania"
    * the city name is inserted as "Brasov"
    * the post code is inserted as "500471"
    * next button for contact information is clicked
    Then the Course Options page opens


  Scenario: Learn the Fundamentals button
    Given I am on the main page
    When Learn the Fundamentals read more button is clicked
    Then Learn the Fundamentals page opens


  Scenario: Course Option page
    Given I am on the Course Option page
    When the Software Testing Manual Tester Certificate is clicked
    Then the Course Options page opens

  Scenario: Payment Information page
    Given I am on the Payment Information page
    When the card holder name is set to "Test"
    And the card number is inserted "749272343"
    * the CVC is inserted "989"
    * the month is inserted
    * the year is inserted
    * the next button is clicked for payment information
    Then the registration should be completed

