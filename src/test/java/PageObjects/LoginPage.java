package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username ")
    WebElement username_xpath;

    @FindBy(id = "password")
    WebElement password_xpath;

    @FindBy(xpath = "//span[@id='input-error']")
    WebElement errorMessage_xpath;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement Signin_xpath;

    public void EnterUsername(String username) {
        username_xpath.sendKeys(username);

    }

    public void EnterPassword(String password) {
        username_xpath.sendKeys(password);

    }

    public void clickSignUp() {
        Signin_xpath.click();
    }
}
