Feature: Horizon

  Scenario Outline: As Clientele use I want to be able to login on platform
    Given the user  has navigated to the login page
    When the user enters userName "<username>"
    And the user enters password "<password>"
    And clicks on the login button
    And user should see error message "<errormessage>"
    Then the user should be able to login successfully
     And land on the dashboard page
Examples:
    |username  |  password|errormessage|
    |"mnyinyi@clientele.co.za" |"10Collections123"|Invalid username or password.|

