package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage extends BaseClass {

    public  signInPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    public void enterPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    public void clickOnLogInBtn() {
        driver.findElement(By.id("login-button")).click();
    }
}
