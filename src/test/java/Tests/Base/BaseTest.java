package Tests.Base;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public ProductsPage productsPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        loginPage.open();
    }

   @AfterMethod(alwaysRun = true)
   public void close() {
        driver.quit();
    }
}


