package pageEvents;

import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementFetch;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import java.util.Scanner;
import org.openqa.selenium.support.ui.Select;

public class LoginPageEvents {
    public void verifyLoginPageOpenOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPath", LoginPageElements.createAccountText).size()>0, "Login Page did not open");
    }
    public void enterNameAndEmailId(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.name).sendKeys("test");
        elementFetch.getWebElement("XPath", LoginPageElements.emailAddress).sendKeys("test_tester12@gmail.com");
    }

    public void VerifyNewUserSignUP(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.verifySignUp).isDisplayed(), "New User Sign Up Page Displays");
    }

    public void clickSignUpButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.signUp).click();
    }

    public void verifyEnterAccountInfoDisplayed(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.accountInfoDisplay).isDisplayed());
    }

    public void enterAccountInfo() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.maleGender).click();
        //elementFetch.getWebElement("XPath", LoginPageElements.name).sendKeys("Test");
        //elementFetch.getWebElement("XPath", LoginPageElements.emailAddress).sendKeys("test?test@gmail.com");
        elementFetch.getWebElement("XPath", LoginPageElements.password).sendKeys("Test");
        Select dateSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.date));
        dateSelect.selectByValue("28");
        Thread.sleep(5000);
        Select monthSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.month));
        monthSelect.selectByValue("7");
        Thread.sleep(5000);
        Select yearSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.year));
        yearSelect.selectByValue("2019");
    }

    public void clickSignUpForNewsLetter(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.newsLetter).click();
        elementFetch.getWebElement("XPath", LoginPageElements.specialOffers).click();
    }

    public void addAddressInformation(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.firstName).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.lastName).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.company).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.address).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.address_2).sendKeys("Test");
        Select selectCountry = new Select(elementFetch.getWebElement("XPath", LoginPageElements.country));
        selectCountry.selectByValue("Canada");
        elementFetch.getWebElement("XPath", LoginPageElements.state).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.city).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.zipCode).sendKeys("10001");
        elementFetch.getWebElement("XPath", LoginPageElements.mobileNumber).sendKeys("00000000000");
    }

    public void clickCreateAccount(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.createAccount).click();
    }

    public void verifyAccountCreated(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.accountCreated).isDisplayed(), "Account is created");
    }

    public void clickContinueButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.continueButton).click();
    }

    public void clickDeleteAccountButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", LoginPageElements.deleteAccount).click();
    }


}
