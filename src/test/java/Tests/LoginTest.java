package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest {
   LoginPage loginPage;

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=title]")).getText(), "Products");
    }

    @Test
    public void loginTestEmpty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("", "");
        assertEquals(driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText(), "Epic sadface: Username is required");
    }

    @Test
    public void loginTestWrong() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("aaa", "bbb");
        assertEquals(driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}

