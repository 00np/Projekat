package tests;

import org.junit.Test;

import pages.HomePage;
import pages.SignInPage;

public class HomePageTests extends BaseTest {

    public HomePage homePage;
    public SignInPage signInPage;

    int allPopularProductsnumber = 7;
    int AllBestsellersNumber = 7;

    @Test
    public void openingSiteTest() {

        homePage = new HomePage(driver);

        homePage.basePage();
    }

    @Test
    public void checkNumberOfProductsPopular() {

        homePage = new HomePage(driver);

        homePage.basePage();
        homePage.scrollDown();
        homePage.validateNumberOfProductsPopular(allPopularProductsnumber);
    }

    @Test
    public void checkNumberOfProductsBestSeller() {

        homePage = new HomePage(driver);

        homePage.basePage();
        homePage.scrollDown();
        homePage.switchOnBestSellers();
        homePage.validateNumberOfProductsBestSeller(AllBestsellersNumber);
    }

    @Test
    public void navigateToSingUpPage() {

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.verifySignInNavigation();
    }
}