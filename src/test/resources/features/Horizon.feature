Feature: Horizon

  Scenario Outline: As Clientele use I want to be able to login on platform
    Given the user  has navigated to the login page
    When the user enters username "<username>"
    And the user enters password "<password>"
    And clicks on the login button
    And user should see error message "<errormessage>"


Examples:
    |username  |  password|errormessage|
    | mnyinyi@clientele.co.za|10Collections123$|                            |
    | mnyinyi@clientele.co.za|10Coections123$ |Invalid username or password.|


