import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utils.ConfigReader;
import utils.WebDriverUtils;

import java.util.Arrays;


public class SignInTest {
    public BaseClass baseClass;
    public WebDriver driver;
    public signInPage signinpage;
    public ProductPage productPage;
    public SoftAssert softAssert;
    public CartPage cartPage;
    public CheckOutInfoPage checkOutInfoPage;
    public CheckoutOverviewPage checkoutOverviewPage;
    public ConfigReader properties;

    @BeforeClass(alwaysRun = true)
    public void setupMethod() throws Exception {
        WebDriverUtils webDriverUtils = new WebDriverUtils();
        properties = new ConfigReader();
        driver = webDriverUtils.getDriver();
        baseClass = new BaseClass(driver);
        signinpage = new signInPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkOutInfoPage = new CheckOutInfoPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        softAssert = new SoftAssert();
        baseClass.navigateToUrl(properties.propertiesFile("baseURL"));
    }

    @Test(groups = {"Regression_High_NonConflicted"}, testName = "TC-001")
    public void VerifyUserShouldAbleToLogIn() {
        signinpage.enterUserName();
        signinpage.enterPassword();
        signinpage.clickOnLogInBtn();
        softAssert.assertEquals(driver.getTitle(), "Swag Labs", "title is incorrect");
        softAssert.assertEquals(productPage.getSecondTitle(), "Products", "title is not matched");
        softAssert.assertEquals(productPage.getInventoryItem(), Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"));
        softAssert.assertAll();
    }

    @Test(groups = {"Regression_High_NonConflicted"}, testName = "TC-002")
    public void productCheckout() {
        productPage.clickOnProductName();
        productPage.clickOnCart();
    }

    @Test(groups = {"Regression_High_NonConflicted"}, testName = "TC-003", dependsOnMethods = {"productCheckout"})
    public void VerifyCartPageTest() {

        softAssert.assertEquals(cartPage.getSecondTitle(), "Your Cart", "title is not matched");
        softAssert.assertEquals(cartPage.getInventoryItem(), "Sauce Labs Bike Light");
        cartPage.clickOnCheckOutbtn();
        softAssert.assertAll();
    }

    @Test(groups = {"Regression_High_NonConflicted"}, testName = "TC-004", dependsOnMethods = {"VerifyCartPageTest"})
    public void VerifyCheckoutYourInformationTest() {

        softAssert.assertEquals(checkOutInfoPage.getSecondTitle(), "Checkout: Your Information", "title is not matched");
        checkOutInfoPage.enterInformation();
        softAssert.assertAll();
    }

    @Test(groups = {"Regression_High_NonConflicted"}, testName = "TC-005", dependsOnMethods = {"VerifyCheckoutYourInformationTest"})
    public void VerifyCheckoutOverviewPageTest() {

        softAssert.assertEquals(checkoutOverviewPage.getSecondTitle(), "Checkout: Overview", "title is not matched");

        checkoutOverviewPage.finishBtn();

        softAssert.assertEquals(checkoutOverviewPage.getSecondTitle(), "Checkout: Complete!", "title is not matched");

        checkoutOverviewPage.backToHome();


        softAssert.assertAll();
    }

    @AfterClass
    public void driverClose() {
        baseClass.killDriver();
    }
}
