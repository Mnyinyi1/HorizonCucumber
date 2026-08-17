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
    public void inHomePageUserClicksOnCaptureQuoteUsernamePassword(String Uname, String Password) {

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
    public void capture_product_details_and_click_continue_button(String Channel, String string2) throws InterruptedException {

        homePage.ClickSelectProduct();
        homePage.ClickSelectProductOption();
        homePage.ClickSelectPlan();
        homePage.ClickSelectPlanOption();
        homePage.ClickContinueButton();


    }

    @When("Capture client details and Plan detail {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void capture_client_details_and_plan_detail(String Channel, String PolicyType, String LegalReferenceOption, String Idnumber, String Title, String Fname, String Lname, String Citizeship, String Gender, String Smoker, String CellNo, String Address1, String Surbub, String CityTown) throws InterruptedException {
        homePage.SelectChannel();
        homePage.ClickChannelOption(Channel);
        homePage.ClickPolicyType();
        homePage.SelectPolicyTypeOption(PolicyType);
        homePage.ClickLegalReferenceType();
        homePage.SelectLegalReferenceTypeOption();
        homePage.EnterLegalRefNo(Idnumber);
        homePage.ClickTitle();
        homePage.SelectTitle(Title);
        homePage.EnterFirstName(Fname);
        homePage.EnterSurname(Lname);
        homePage.ClickCitizenship();
        homePage.SelectCitizenOption(Citizeship);
        homePage.OpenGenderDropdown();
        homePage.SelectGenderOption(Gender);
        homePage.OpenSmoker();
        homePage.SelectSmokingStatus(Smoker);
        homePage.EnterCellNo(CellNo);
        homePage.EnterAddress1(Address1);
        homePage.EnterSuburb(Surbub);
        homePage.EnterCity(CityTown);
        homePage.EnterPostalCode("2000");
//        homePage.ClickPostalAddressSameAsPhysical();

    }

    @When("Clicks on review benefits button and Click continue button")
    public void clicks_on_review_benefits_button_and_click_continue_button() throws InterruptedException {
        homePage.ReviewBenefitButton();
        homePage.ClickContinueButton1();
    }

    @When("Clicks on save button")
    public void clicks_on_save_button() {
        homePage.clickSaveButton();
    }

    @When("user Navigate to Payer")
    public void user_navigate_to_payer() {
        homePage.ClickPayerTab();
    }

    @When("Capture payer information and Account information {string},{string},{string},{string},{string},{string},{string},{string}")
    public void capture_payer_information_and_account_information(String RelationTomember, String P_method, String Bank, String Dday, String SelectBank, String Branch, String EnterBankAccNo, String AccoutType) throws InterruptedException {
        homePage.openRelationDropdown();
        homePage.selectRelation(RelationTomember);
        homePage.OpePaymentMethod();
        homePage.SelectPaymentMethod(P_method);
        homePage.ClickBankDetailsTab();
        homePage.EnterBankAccHolderName(Bank);
        homePage.OpenDeductDayDropdown();
        homePage.SelectDebitDay(Dday);
        homePage.OpenBankNameDropdown();
        homePage.SelectBankName(SelectBank);
        homePage.OpenBranchDropdown();
        homePage.SelectBranchOption(Branch);
        homePage.EnterBankAccNo(EnterBankAccNo);
        homePage.openAccountTypeDropdown();
        homePage.selectAccountType(AccoutType);



    }

    @And("Click save button")
    public void clickSaveButton() {

        homePage.clickSavePayerButton();
        homePage.verifyPayerSuccessfullySaved();

    }

    @And("user Navigate to Summary and Click on submit button")
    public void userNavigateToSummaryAndClickOnSubmitButton() {
        homePage.ClickSumaryTab();
         homePage.verifySummaryTabDisplayed();
         homePage.clickCommitPolicyButton();
         homePage.clickConfirmButton();
         homePage.clickYesButton();
         homePage.clickYesBButton();
         homePage.clickYesBBButton();
         homePage.clickAuthenticateNowButton();
         homePage.clickConfirmDButton();

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




