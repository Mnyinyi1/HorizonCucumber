package PageObjects;

import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.//span[text()='Client Capture']]")
    WebElement clientcapture_xpath;

    public void verifyInformationBoxIsDisplayed() throws InterruptedException {
          Thread.sleep(5000);
        clientcapture_xpath.isDisplayed();
        TakeScreenshots.takeScreenshot(driver, "HomePage");
    }
}