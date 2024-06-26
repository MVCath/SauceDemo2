package Tests;

import Pages.ProductsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test

    public void buyProduct() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.addToCartByIndex(2);
        productsPage.openCart();
    }
}
