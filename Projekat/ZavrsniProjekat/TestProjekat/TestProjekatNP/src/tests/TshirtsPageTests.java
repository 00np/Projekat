package tests;

import org.junit.Test;

import pages.HomePage;
import pages.TshirtsPage;

public class TshirtsPageTests extends BaseTest {

    public HomePage homePage;
    public TshirtsPage tshirtsPage;

    String TextTshirts = "T-SHIRTS ";
    String CartProductText = " Successfully added to shopping cart";

    @Test
    public void tshirtsCartTest() {

        homePage = new HomePage(driver);
        tshirtsPage = new TshirtsPage(driver);

        homePage.basePage();
        homePage.navigateToTshitsPage();
        tshirtsPage.verifyTshitsPage(TextTshirts);
        tshirtsPage.putProductInCart();
        tshirtsPage.verifyProductInCart(CartProductText);
    }
}