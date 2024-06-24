import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//span[text()='Products']"));
    }

    @Test
    public void loginTestEmpty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("password"));
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']"));

    }

    @Test
    public void loginTestWrong() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("aaa");
        driver.findElement(By.name("password")).sendKeys("bbb");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"));

    }
}

