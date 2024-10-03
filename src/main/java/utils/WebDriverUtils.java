package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtils {
    public WebDriver getDriver() {
        // WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().driverVersion("129.0.6668.59").setup();
        //ChromeOptions options = new ChromeOptions();
        // options.addArguments("start-maximized");
        return new ChromeDriver();
    }
}