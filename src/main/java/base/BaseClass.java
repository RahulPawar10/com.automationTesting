package base;


import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class BaseClass {
    public WebDriver driver;

    public  BaseClass(WebDriver driver) {
        this.driver = driver;
    }


    public void navigateToUrl(String url) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);

    }

    public void killDriver() {
        if (driver != null)
            driver.quit();
    }
}
