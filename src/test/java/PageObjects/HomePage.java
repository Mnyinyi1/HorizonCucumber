package PageObjects;

import Utils.TakeScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Utils.TakeScreenshots.takeScreenshot;



public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "//li[@class='rz-navigation-item']//span[text()='Home']")
    WebElement HomePageLink_xpath;

    @FindBy(xpath = "//span[text()='Client Capture']")
    WebElement ClientCapture_xpath;

    public void ClickClientCapture() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(ClientCapture_xpath));
        ClientCapture_xpath.click();

    }

    @FindBy(xpath = "//button[contains(@class,'rz-button')]//span[text()='New Quote Capture']")
    WebElement NewQuoteCaptureButton_xpath;

    public void ClickNewQuoteCaptureButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(NewQuoteCaptureButton_xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewQuoteCaptureButton_xpath);
        try {
            NewQuoteCaptureButton_xpath.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", NewQuoteCaptureButton_xpath);
        }
    }

    @FindBy(xpath = "//div[contains(@class,'rz-dropdown')]//span[contains(@class,'rz-dropdown-label')]")
    WebElement SelectProduct_xpath;

    public void ClickSelectProduct() {
        new WebDriverWait(driver, Duration.ofSeconds(70))
                .until(ExpectedConditions.elementToBeClickable(SelectProduct_xpath));
        SelectProduct_xpath.click();
    }

    @FindBy(xpath = "//li[@role='option' and @aria-label='Clientele Funeral Dignity Plan']")
    WebElement SelectProductoption_xpath;

    public void ClickSelectProductOption() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(SelectProductoption_xpath));
        SelectProductoption_xpath.click();
    }

    @FindBy(xpath = "//div[contains(@class,'rz-form-field')][.//label[normalize-space()='Select Plan']]//div[contains(@class,'rz-dropdown') and not(contains(@class,'rz-state-empty'))]")
    WebElement SelectPlan_xpath;

    public void ClickSelectPlan() throws InterruptedException {
        Thread.sleep(3000);
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(SelectPlan_xpath));
        SelectPlan_xpath.click();
    }

    @FindBy(xpath = "//ul[@role='listbox']//li//span[text()='Clientèle Funeral Dignity Plan']")
    WebElement SelectPlanOption_xpath;

    public void ClickSelectPlanOption() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(SelectPlanOption_xpath));
        SelectPlanOption_xpath.click();

    }

    @FindBy(xpath = "//button[contains(@class,'rz-button') and .//span[text()='Continue']]")
    WebElement ContinueButton_xpath;

    public void ClickContinueButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(80))
                .until(ExpectedConditions.elementToBeClickable(ContinueButton_xpath));
        ContinueButton_xpath.click();
        Thread.sleep(9000);
        //takeScreenshot(driver, "ProductsScreen");
    }

    @FindBy(xpath = "//input[@name='SalesChannelNameDescr']/ancestor::div[contains(@class,'rz-dropdown')]")
    WebElement Channel_xpath;

    public void SelectChannel() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Channel_xpath));
        Channel_xpath.click(); // Open the dropdown


        //takeScreenshot(driver, "QuoteScreen");
    }

    @FindBy(xpath = "//ul[contains(@class,'rz-dropdown-list')]//li[@role='option' and @aria-label='Broker']")
    WebElement ChannelOption_xpath;

    public void ClickChannelOption(String ChannelName) {

        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(ChannelOption_xpath));
        ChannelOption_xpath.click();
    }

    @FindBy(xpath = "//button[contains(@class,'rz-button') and .//span[text()='Review Benefits']]")
    WebElement ReviewBenefitsButton_xpath;

    public void ClickReviewBenefitsButton() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(ReviewBenefitsButton_xpath));
        ReviewBenefitsButton_xpath.click();
    }

    @FindBy(xpath = "//input[@id='PlanCategoryDescr']/ancestor::div[contains(@class,'rz-dropdown')]")
    WebElement PolicyType_xpath;

    public void ClickPolicyType() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(PolicyType_xpath));
        PolicyType_xpath.click();
        Thread.sleep(6000);
    }

    //    @FindBy(xpath="//ul[contains(@class,'rz-dropdown-list')]//li[span[normalize-space()='Member Only']]")
//    WebElement PolicyTypeOption_xpath;
//    public  void SelectPolicyTypeOption(String policyType) {
//
//        WebElement PolicyTypeOption = new WebDriverWait(driver, Duration.ofSeconds(50))
//                .until(ExpectedConditions.elementToBeClickable(PolicyTypeOption_xpath));
//        Select select = new Select(PolicyTypeOption);
//        select.selectByVisibleText(policyType);
//
//
//    }
    public void SelectPolicyTypeOption(String policyType) {

        By policyTypeOption = By.xpath(
                "//ul[contains(@class,'rz-dropdown-list')]//li[@role='option' and @aria-label='" + policyType + "']");

        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(policyTypeOption));

        option.click();
    }

    @FindBy(xpath = "//input[@id='LegalRefNoType']/ancestor::div[contains(@class,'rz-dropdown')]")
    WebElement LegalReferenceType_xpath;

    public void ClickLegalReferenceType() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(LegalReferenceType_xpath));
        LegalReferenceType_xpath.click();
    }

    @FindBy(xpath = "//li[@role='option' and .//span[normalize-space()='ID Number']]")
    WebElement LegalReferenceTypeOption_xpath;

    public void SelectLegalReferenceTypeOption() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(LegalReferenceTypeOption_xpath));
        LegalReferenceTypeOption_xpath.click();
    }

    @FindBy(name = "LegalRefNo")
    WebElement EnterLegalRefNo_xpath;

    public void EnterLegalRefNo(String legalRefNo) throws InterruptedException {
        Thread.sleep(3000);
        new WebDriverWait(driver, Duration.ofSeconds(70))
                .until(ExpectedConditions.elementToBeClickable(EnterLegalRefNo_xpath));
        EnterLegalRefNo_xpath.sendKeys(legalRefNo);

    }

    @FindBy(xpath = "//input[@name='Title']/ancestor::div[contains(@class,'rz-dropdown')]")
    WebElement OpenTitle_xpath;

    public void ClickTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(OpenTitle_xpath));
        OpenTitle_xpath.click();
    }

    public void SelectTitle(String title) throws InterruptedException {
        Thread.sleep(3000);
        By titleOption = By.xpath(
                "//li[@role='option' and @aria-label='" + title + "']");

        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.presenceOfElementLocated(titleOption));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
    }

    @FindBy(id = "FirstName")
    WebElement FirstName_id;

    public void EnterFirstName(String firstName) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(FirstName_id));
        FirstName_id.sendKeys(firstName);
    }

    @FindBy(id = "Surname")
    WebElement Surname_id;

    public void EnterSurname(String LastName) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Surname_id));
        Surname_id.sendKeys(LastName);
    }

    @FindBy(xpath = "//input[@name='Citizenship']/ancestor::div[contains(@class,'rz-dropdown')]")
    WebElement Citizenship_xpath;

    public void ClickCitizenship() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Citizenship_xpath));
        Citizenship_xpath.click();
    }

    public void SelectCitizenOption(String Citizen) throws InterruptedException {
        Thread.sleep(3000);

        By CitizenOption = By.xpath(
                "//li[@role='option' and @aria-label='" + Citizen + "']"
        );

        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.presenceOfElementLocated(CitizenOption));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
    }

    @FindBy(xpath = "//div[contains(@class,'rz-dropdown') and .//input[@name='GenderCd']]")
    WebElement GenderDropdown_xpath;

    public void OpenGenderDropdown() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(GenderDropdown_xpath));
        GenderDropdown_xpath.click();
    }

    public void SelectGenderOption(String Gender) throws InterruptedException {
        Thread.sleep(3000);

        By CitizenOption = By.xpath(
                "//li[@role='option' and @aria-label='" + Gender + "']"
        );

        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.presenceOfElementLocated(CitizenOption));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
    }

    @FindBy(xpath = "//label[normalize-space()='Smoker']/preceding-sibling::div[contains(@class,'rz-dropdown')]")
    WebElement Smoker_xpath;

    public void OpenSmoker() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Smoker_xpath));
        Smoker_xpath.click();
    }

    public void SelectSmokingStatus(String status) {

        By option = By.xpath(
                String.format("//li[@role='option' and @aria-label='%s']", status)
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(option));

        element.click();
    }

    @FindBy(name = "CellNumber")
    WebElement CellNo_name;

    public void EnterCellNo(String cellNo) {
        new WebDriverWait(driver, Duration.ofSeconds(90))
                .until(ExpectedConditions.elementToBeClickable(CellNo_name));
        CellNo_name.sendKeys(cellNo);
    }

    @FindBy(id = "PhysicalAddress1")
    WebElement Address1_id;

    public void EnterAddress1(String address1) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Address1_id));
        Address1_id.sendKeys(address1);
    }

    @FindBy(id = "PhysicalSuburb")
    WebElement Suburb_id;

    public void EnterSuburb(String suburb) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(Suburb_id));
        Suburb_id.sendKeys(suburb);
    }

    @FindBy(id = "PhysicalTownCity")
    WebElement City_id;

    public void EnterCity(String city) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(City_id));
        City_id.sendKeys(city);
    }

    @FindBy(name = "PhysicalPostalCode")
    WebElement PostalCode_name;

    public void EnterPostalCode(String postalCode) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(PostalCode_name));
        PostalCode_name.sendKeys(postalCode);
    }

    @FindBy(xpath = "//input[@id='PostalAddressSameAsPhysical']/ancestor::div[contains(@class,'rz-chkbox')]//div[contains(@class,'rz-chkbox-box')]")
    WebElement PostalAddressSameAsPhysical_xpath;

    public void ClickPostalAddressSameAsPhysical() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(PostalAddressSameAsPhysical_xpath));
        PostalAddressSameAsPhysical_xpath.click();
    }

    @FindBy(xpath = "//button[.//span[normalize-space()='Review benefit']]")
    WebElement ReviewBenefitButton_xpath;

    public void ReviewBenefitButton() throws InterruptedException {
        Thread.sleep(3000);
        new WebDriverWait(driver, Duration.ofSeconds(70))
                .until(ExpectedConditions.elementToBeClickable(ReviewBenefitButton_xpath));
        ReviewBenefitButton_xpath.click();
    }
    @FindBy(xpath = "//button[.//span[normalize-space()='Continue']]")
    WebElement ContinueButton1_xpath;
    public  void ClickContinueButton1() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(ContinueButton1_xpath));
        ContinueButton1_xpath.click();
    }

    public void clickSaveButton() {
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@type='submit' and .//span[normalize-space()='Save']]")));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", btn);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", btn);
    }

    @FindBy(xpath = "//li[a/span[@class='rz-steps-title' and normalize-space()='Payer']]")
    WebElement payerTab;

    public void ClickPayerTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

        WebElement payerTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[.//span[normalize-space()='Payer']]")
                )
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", payerTab);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", payerTab);
    }
    @FindBy(xpath = "//div[contains(@class,'rz-dropdown')][.//input[@name='RelationDescr']]")
    private WebElement relationDropdown;

    public void openRelationDropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        wait.until(ExpectedConditions.visibilityOf(relationDropdown));
        wait.until(ExpectedConditions.elementToBeClickable(relationDropdown));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", relationDropdown);

        relationDropdown.click();
    }
    public void selectRelation(String relation) {

        openRelationDropdown();

        By optionLocator = By.xpath(
                "//li[@role='option'][.//span[normalize-space()='" + relation + "']]"
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

        WebElement option = wait.until(
                ExpectedConditions.visibilityOfElementLocated(optionLocator)
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", option);

        wait.until(ExpectedConditions.elementToBeClickable(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
    }
    @FindBy(xpath = "//div[contains(@class,'rz-dropdown')][.//input[@name='Title']]")
     WebElement titleDropdown;

    public void openTitleDropdown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(titleDropdown));
        wait.until(ExpectedConditions.elementToBeClickable(titleDropdown));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});",
                        titleDropdown);

        titleDropdown.click();
    }
    public void PselectTitle(String title) {

        openTitleDropdown();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        By optionLocator = By.xpath(
                "//li[@role='option']//span[normalize-space()='" + title + "']");

        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(optionLocator));

        option.click();
    }
   @FindBy(xpath = "//input[@name='PaymentMethod']/ancestor::div[contains(@class,'rz-dropdown')]")
   WebElement paymentMethodDropdown_xpath;
    public void OpePaymentMethod() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(paymentMethodDropdown_xpath));
        wait.until(ExpectedConditions.elementToBeClickable(paymentMethodDropdown_xpath));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", paymentMethodDropdown_xpath);

        paymentMethodDropdown_xpath.click();

    }
    public void SelectPaymentMethod(String paymentMethod) {

        By option = By.xpath(
                String.format("//li[@role='option' and @aria-label='%s']", paymentMethod)
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void ClickBankDetailsTab() {

        By bankDetailsTab = By.xpath(
                "//li[contains(@class,'rz-tabview-selected') or @role='presentation']//span[normalize-space()='Bank Details']"
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(bankDetailsTab));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    @FindBy(id = "BankAccHolderName")
    WebElement BankHolder_id;

    public void EnterBankAccHolderName(String Bank) {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(BankHolder_id));
        BankHolder_id.sendKeys(Bank);
    }
    public void OpenDeductDayDropdown() {

        By dropdown = By.xpath(
                "//input[@name='Deduct_Day']/ancestor::div[contains(@class,'rz-dropdown')]"
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOfElementLocated(dropdown));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void SelectDebitDay(String DebitDay) {

        By option = By.xpath(
                String.format("//li[@role='option' and @aria-label='%s']", DebitDay)
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void OpenBankNameDropdown() {

        By dropdown = By.xpath(
                "//input[@name='BankName']/ancestor::div[contains(@class,'rz-dropdown')]"
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(dropdown));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void SelectBankName(String bankName) {

        By option = By.xpath(
                String.format(
                        "//div[contains(@class,'rz-open')]//li[@role='option' and @aria-label='%s']",
                        bankName)
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOfElementLocated(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void OpenBranchDropdown() {

        By dropdown = By.xpath(
                "//input[@name='Branch']/ancestor::div[contains(@class,'rz-dropdown')]"
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(dropdown));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public void SelectBranchOption(String Branch) {

        By option = By.xpath(
                "//li[contains(@class,'rz-dropdown-item')]//span[normalize-space()='" + Branch + "']"
        );

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    @FindBy(xpath = "//input[@name='BankAccNo']")

    WebElement bankAccNoTextbox;
    public void EnterBankAccNo(String accountNumber) {

        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOf(bankAccNoTextbox));

        bankAccNoTextbox.clear();
        bankAccNoTextbox.sendKeys(accountNumber);
    }

    public void openAccountTypeDropdown() {

        By dropdownLocator = By.id("BankAccTypeCD");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement dropdown = wait.until(
                ExpectedConditions.presenceOfElementLocated(dropdownLocator));

        // Click the parent dropdown container
        WebElement dropdownContainer = dropdown.findElement(By.xpath("./ancestor::div[contains(@class,'rz-dropdown')]"));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", dropdownContainer);

        wait.until(ExpectedConditions.elementToBeClickable(dropdownContainer));

        dropdownContainer.click();

        // Wait for dropdown panel to open
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.cssSelector(".rz-dropdown-panel[style*='display:block']")));
    }
    public void selectAccountType(String accountType) {

        By optionLocator = By.xpath(
                "//li[@role='option' and @aria-label='" + accountType + "']"
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(optionLocator)
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
    }
    public void clickSavePayerButton() {

        By saveButtonLocator = By.xpath("//button[@type='submit']//span[text()='Save']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement saveButton = wait.until(
                ExpectedConditions.elementToBeClickable(saveButtonLocator));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", saveButton);

        saveButton.click();
    }



    public void verifyPayerSuccessfullySaved() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement notification = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'rz-notification-content') and contains(text(),'Payer and account information successfully saved.')]")
                )
        );
        takeScreenshot(driver, "PayerSaveSuccess");
        Assert.assertEquals(
                notification.getText().trim(),
                "Payer and account information successfully saved.",
                "Incorrect success message displayed."

        );
        takeScreenshot(driver, "PayerSaveSuccess");
    }
    @FindBy(xpath = "//li[a/span[@class='rz-steps-title' and normalize-space()='Payer']]")
    WebElement SummaryTab;
    public void ClickSumaryTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

        WebElement SummaryTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[.//span[normalize-space()='Summary']]")
                )
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", SummaryTab);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", SummaryTab);
    }
    public void verifySummaryTabDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement summaryTab = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//span[normalize-space()='SUMMARY']")
                )
        );

        takeScreenshot(driver, "SummaryTabDisplayed");

        Assert.assertEquals(
                summaryTab.getText().trim(),
                "SUMMARY",
                "User is not on the SUMMARY tab."
        );

        takeScreenshot(driver, "SummaryTabDisplayed");
    }
    public void clickCommitPolicyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement commitPolicyButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[normalize-space()='Commit Policy']/ancestor::button")
                )
        );

        commitPolicyButton.click();

        takeScreenshot(driver, "CommitPolicyClicked");
    }
    public void clickConfirmButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement confirmButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[.//span[normalize-space()='Confirm']]")
                )
        );

        takeScreenshot(driver, "BeforeClickConfirm");

        confirmButton.click();

        takeScreenshot(driver, "AfterClickConfirm");
    }
    public void clickYesButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement yesButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[.//span[normalize-space()='Yes']]")
                )
        );

        takeScreenshot(driver, "BeforeClickYes");

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", yesButton);

        takeScreenshot(driver, "AfterClickYes");
    }
    public void clickYesBButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement yesButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(@class,'rz-primary')]//span[normalize-space()='Yes']/ancestor::button")
                )
        );

        takeScreenshot(driver, "BeforeClickYes");

        yesButton.click();

        takeScreenshot(driver, "AfterClickYes");
    }
    public void clickYesBBButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement yesButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[.//span[normalize-space()='Yes']]")
                )
        );

        takeScreenshot(driver, "BeforeClickYes");

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", yesButton);

        takeScreenshot(driver, "AfterClickYes");
    }

    public void clickAuthenticateNowButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement authenticateNowButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[.//span[normalize-space()='Authenticate Now']]")
                )
        );

        takeScreenshot(driver, "BeforeClickAuthenticateNow");

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", authenticateNowButton);

        takeScreenshot(driver, "AfterClickAuthenticateNow");
    }
    public void clickConfirmDButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement confirmButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[.//span[normalize-space()='Confirm']]")
                )
        );

        takeScreenshot(driver, "BeforeClickConfirm");

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", confirmButton);

        takeScreenshot(driver, "AfterClickConfirm");
    }
}