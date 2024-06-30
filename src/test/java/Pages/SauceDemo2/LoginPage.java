package Pages.SauceDemo2;
import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.name("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR_LOGIN = By.xpath("//h3[contains(@data-test,'error')]");
    public void open () {
        driver.get("https://www.saucedemo.com");
    }

    public void login (String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public String getErrorText(){
        return  driver.findElement(ERROR_LOGIN).getText();
    }
}
