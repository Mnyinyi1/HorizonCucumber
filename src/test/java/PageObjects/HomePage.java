package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


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
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(SelectProduct_xpath));
        SelectProduct_xpath.click();
    }


}