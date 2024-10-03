package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSecondTitle() {
        return driver.findElement(By.xpath("//div[@class='header_secondary_container']/span")).getText();
    }

    public String getInventoryItem() {
        WebElement element = driver.findElement(By.xpath("//div[@class='cart_item']/child::div/*/div[@class='inventory_item_name']"));
        return element.getText();
    }

    public void clickOnCheckOutbtn() {
        driver.findElement(By.id("checkout")).click();
    }

}
