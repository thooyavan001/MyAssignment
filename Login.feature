Feature: Login functinality of leaftap application

  Scenario: Login for Positive credential
    Given Open the browser
    And Load the url
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click login button
    Then Homepage sould be displayed

    