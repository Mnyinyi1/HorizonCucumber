package Utils;

import PageObjects.HomePage;
import PageObjects.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    protected WebDriver driver; // Changed to protected and non-static
    public LoginPage loginPage;
    public TakeScreenshots takesScreenshots;
    public HomePage homePage;

    public Base() {
        // Initialize the driver in the constructor
        this.driver = BrowserFactory.startbrowser("chrome", "https://horizontest.clientele.co.za/horizon.ui/");
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
        this.takesScreenshots = new TakeScreenshots();
        this.homePage = PageFactory.initElements(driver, HomePage.class);
    }
}
