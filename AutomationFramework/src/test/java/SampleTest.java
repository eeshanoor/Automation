import WebTestBase.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class SampleTest extends BaseTest {
        @Test
        public void sampleMethodForEmailEntering() throws InterruptedException {
            HomePageEvents homePageEvents = new HomePageEvents();
            Thread.sleep(60000);
            homePageEvents.clickOnSignInButton();

            LoginPageEvents loginPageEvents = new LoginPageEvents();
            //loginPageEvents.verifyLoginPageOpenOrNot();
            loginPageEvents.enterEmailId();
        }
}
