package tests;

import org.junit.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

public class SignInPageTests extends BaseTest {

    public HomePage homePage;
    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    String emailText = "nikola.vmp@gmail.com";
    String password = "Code23";
    String signOutButton = "Sign out";
    String textPersonalInfo = "YOUR PERSONAL INFORMATION";

    @Test
    public void login() {

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.login(emailText, password);
        myAccountPage.verifyLogin(signOutButton);
    }
}
