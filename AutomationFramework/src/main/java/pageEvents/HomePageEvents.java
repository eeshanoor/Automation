package pageEvents;


import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
    public void clickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", HomePageElements.signInButton).click();
    }
}
