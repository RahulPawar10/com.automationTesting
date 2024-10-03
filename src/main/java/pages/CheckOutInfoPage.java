package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage {
    public WebDriver driver;

    public CheckOutInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSecondTitle() {
        return driver.findElement(By.xpath("//div[@class='header_secondary_container']/span")).getText();
    }

    public void enterInformation() {
        driver.findElement(By.id("first-name")).sendKeys("ABC");
        driver.findElement(By.id("last-name")).sendKeys("XYZ");
        driver.findElement(By.id("postal-code")).sendKeys("144111");
        driver.findElement(By.id("continue")).click();
    }
}
