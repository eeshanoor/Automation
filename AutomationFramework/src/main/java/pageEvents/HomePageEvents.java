package pageEvents;


import org.testng.Assert;
import pageObjects.HomePageElements;
import utils.ElementFetch;
import org.openqa.selenium.support.Color;

public class HomePageEvents {
    public void clickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", HomePageElements.signInButton).click();
    }

    public void clickOnTeeShirts(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", HomePageElements.t_shirts).click();
    }

    public void verifyHomePageSelected(){
        ElementFetch elementFetch = new ElementFetch();
        //Assert.assertTrue(elementFetch.getListWebElements("XPath", HomePageElements.Home).getCssValue("color"), "Home Page appears");
    }
}
