package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ProductPage {
    public WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSecondTitle() {
        return driver.findElement(By.xpath("//div[@class='header_secondary_container']/span")).getText();
    }

    public List<String> getInventoryItem() {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (WebElement element : elements) {
            list.add(element.getText());
        }
        return list;
    }

    public void clickOnProductName() {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_item_label']/a/div"));
        for (WebElement element : elements) {//parent::a/../following-sibling::div/div/following::button
            if (element.getText().equals("Sauce Labs Bike Light")) {
                element.findElement(By.xpath("parent::a/../following-sibling::div/div/following::button")).click();
            }
        }
    }

    public void clickOnCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
