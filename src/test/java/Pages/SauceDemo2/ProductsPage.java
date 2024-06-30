package Pages.SauceDemo2;
import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    private final By TITLE = By.cssSelector("[class=title]");

    private final By CART = By.cssSelector(".shopping_cart_link");

    private final String ADD_TO_CART_PATTERN =
            "//div[text()='%s']//ancestor::div[@class='inventory_item']//button[text()='Add to cart']";

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
    }

    public void addToCart(String product) {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_PATTERN,product));
        driver.findElement(addToCartButton).click();
    }

    public void openCart() {
        driver.findElement(CART).click();
    }
}
