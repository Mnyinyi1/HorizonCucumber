package StepDefinitions;


import PageObjects.HomePage;
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
    public void clicks_on_the_login_button() throws InterruptedException {
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
       // below are the steps for the capture quote feature
@Given("In home Page user clicks on capture Quote{string},{string}")
public void inHomePageUserClicksOnCaptureQuoteUsernamePassword(String Uname,String Password) {

        loginPage.EnterUsername(Uname);
        loginPage.EnterPassword(Password);
        loginPage.clickSignUp();
    homePage.ClickClientCapture();
}
    @When("Clicks on  new capture Quote")
    public void clicks_on_new_capture_quote() {
       homePage.ClickNewQuoteCaptureButton();
    }
    @When("Capture product details and  click continue button {string},{string}")
    public void capture_product_details_and_click_continue_button(String string, String string2) {

     homePage.ClickSelectProduct();
    }
    @When("Capture client details and Plan detail {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void capture_client_details_and_plan_detail(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicks on review benefits button and Click continue button")
    public void clicks_on_review_benefits_button_and_click_continue_button() {

    }
    @When("Clicks on save button")
    public void clicks_on_save_button() {

    }
    @When("user Navigate to Payer")
    public void user_navigate_to_payer() {

    }
    @When("Capture payer information and Account information {string},{string},{string},{string},{string},{string},{string},{string}")
    public void capture_payer_information_and_account_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

    }
    @And("Click save button")
    public void clickSaveButton() {
    }




    @After
    public void closeBrowser() {
      //  TakeScreenshots.takeScreenshot(driver, "End_of_Scenario"); // Add this line
        driver.close();
    }


    @Given("the user has navigated to the login page")
    public void theUserHasNavigatedToTheLoginPage() {
    }


}




