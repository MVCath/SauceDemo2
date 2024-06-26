package Tests;

import Pages.LoginPage;
import Pages.ProductsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(productsPage.getTitleText(), "Products");
    }

    @Test
    public void loginTestEmpty() {
        loginPage.login("", "");
        assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void loginTestWrong() {
        loginPage.login("aaa", "bbb");
        assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");
    }
}

