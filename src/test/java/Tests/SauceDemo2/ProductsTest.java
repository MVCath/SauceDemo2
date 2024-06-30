package Tests.SauceDemo2;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class ProductsTest extends BaseTest {
    @Test
    public void buyProduct() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.addToCart("Sauce Labs Bike Light");
        productsPage.openCart();
        assertTrue(cartPage.getProductsNames().contains("Sauce Labs Backpack"));
    }
}
