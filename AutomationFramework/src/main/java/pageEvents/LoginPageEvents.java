package pageEvents;

import utils.ElementFetch;
///import org.testng.Assert;
import pageObjects.LoginPageElements;

public class LoginPageEvents {
   // public void verifyLoginPageOpenOrNot(){
     //   ElementFetch elementFetch = new ElementFetch();
       // Assert.assertTrue(elementFetch.getListWebElements("XPath", LoginPageElements.createAccountText).size()>0, "Login Page did not open");
    //}
    public void enterEmailId(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("test@gmail.com");
    }
}
