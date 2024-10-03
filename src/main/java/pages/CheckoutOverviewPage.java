package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutOverviewPage {
    public WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSecondTitle() {
        return driver.findElement(By.xpath("//div[@class='header_secondary_container']/span")).getText();
    }

    public void finishBtn() {
        driver.findElement(By.id("finish")).click();
    }

    public void backToHome() {
        driver.findElement(By.id("back-to-products")).click();
    }
}
