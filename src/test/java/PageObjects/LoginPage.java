package PageObjects;

import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement username_xpath;

    @FindBy(id = "password")
    WebElement password_xpath;

    @FindBy(id = "input-error")
    WebElement errorMessage_Id;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement Signin_xpath;

    public void EnterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(username_xpath));
        username_xpath.sendKeys(username);

    }

    public void EnterPassword(String password) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(password_xpath));
        password_xpath.sendKeys(password);



    }

    public void clickSignUp() {

        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(Signin_xpath));
        Signin_xpath.click();
       TakeScreenshots.takeScreenshot(driver, "LoginPage");
    }

        public void DisplayError(String expectedMessage) {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(30))
                        .until(ExpectedConditions.visibilityOf(errorMessage_Id));
                String actual = errorMessage_Id.getText().trim();
                System.out.println("Login error message: " + actual);
                if (!actual.equals(expectedMessage)) {
                    TakeScreenshots.takeScreenshot(driver, "LoginErrorMismatch");
                    Assert.fail("Expected error: \"" + expectedMessage + "\" but was: \"" + actual + "\"");
                }
                // passes when equal
            } catch (Exception e) {
                TakeScreenshots.takeScreenshot(driver, "LoginErrorMissing");
                Assert.fail("Login error message not displayed or other error: " + e.getMessage());
            }
        }
}
