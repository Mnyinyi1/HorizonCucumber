package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserFactory {
   public static WebDriver driver;

    public static WebDriver startbrowser(String browserchoice, String url) {
        switch (browserchoice.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOption);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser choice. Please choose Chrome, Firefox, or Edge.");
                return null;
        }
    driver.get(url);
    driver.manage().window().maximize();
    return driver;
    }
}