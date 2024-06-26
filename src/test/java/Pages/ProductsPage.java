package Pages;

import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By TITLE = By.cssSelector("[class=title]");

    private final By CART = By.cssSelector(".shopping_cart_link");

    private final String ADD_TO_CART_PATTERN =
            "//div[text()='%s']//ancestor::div[@class='inventory_item']//button[text()='Add to cart']";

    public String getTitleText() {
        return driver.findElement(TITLE).getText();
    }

    public void addToCart(String product) {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_PATTERN,product));
        driver.findElement(addToCartButton).click();

    }
    public void addToCartByIndex(int index) {
        driver.findElements(By.xpath("//*[@class='inventory_item']//button")).get(2).click();

    }

    public void openCart() {
        driver.findElement(CART).click();
    }
}

