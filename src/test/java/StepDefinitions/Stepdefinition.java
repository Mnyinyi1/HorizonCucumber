package StepDefinitions;


import Utils.Base;
import Utils.TakeScreenshots;
import io.cucumber.java.After;
import io.cucumber.java.en.*;



public class Stepdefinition extends Base {

    @Given("the user  has navigated to the login page")
    public void the_user_has_navigated_to_the_login_page() {

    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {

        loginPage.EnterUsername(username);
    }

    @When("the user enters password {string}")
    public void the_user_enters_password(String password) {

        loginPage.EnterPassword(password);
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.clickSignUp();

    }

    @When("user should see error message {string}")
    public void user_should_see_error_message(String errorMessage) {

        loginPage.DisplayError(errorMessage);
    }

//    @Then("the user should be able to login successfully")
//    public void the_user_should_be_able_to_login_successfully() throws InterruptedException {
//        homePage.verifyInformationBoxIsDisplayed();
//
//    }


    @After
    public void closeBrowser() {
        TakeScreenshots.takeScreenshot(driver, "End_of_Scenario"); // Add this line
        driver.close();
    }
}




