
//package package Utils;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.io.File;
//
//public class TakeScreenshots {
//    private static final String screenshotPath = System.getProperty("user.dir") + "/Screenshots/";
//
//public void takesScreenshot(WebDriver driver, String screenshotName) {
//    TakesScreenshot screenshot = (TakesScreenshot) Base.driver;
//    File src = screenshot.getScreenshotAs(OutputType.FILE);
//    File dest = new File(screenshotPath + System.currentTimeMillis() + ".png");
//    try {
//        org.openqa.selenium.io.FileHandler.copy(src, dest);
//    } catch (Exception e) {
//        System.out.println("Failed to capture screenshot: " + e.getMessage());
//    }
//}
// Java
package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TakeScreenshots {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");

    public static void takeScreenshot(WebDriver driver, String name) {
        if (driver == null) {
            System.err.println("TakeScreenshots: WebDriver is null, skipping screenshot.");
            return;
        }
        if (!(driver instanceof TakesScreenshot)) {
            System.err.println("TakeScreenshots: driver does not support screenshots.");
            return;
        }

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = LocalDateTime.now().format(FORMATTER);
            Path dir = Path.of("src", "screenshots");
            Files.createDirectories(dir);
            Path dest = dir.resolve(name + "_" + timestamp + ".png");
            Files.copy(src.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved to: " + dest.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("TakeScreenshots: failed to save screenshot: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("TakeScreenshots: unexpected error: " + e.getMessage());
        }
    }
}