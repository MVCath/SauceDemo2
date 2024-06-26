package Pages.Heroku;

import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuDynamicControlPage extends BasePage {

    private final By BUTTON_REMOVE = By.xpath("//button[text()='Remove']");
    //private final By IS_GONE = By.xpath("//p[text()='It's gone!']");
    private final By IS_GONE = By.xpath("//p[@id='message']");
    private final By CHECKBOX_VISIBLE = By.id("checkbox");

    public HerokuDynamicControlPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

    }

    public void clickButtonRemove(){
        driver.findElement(BUTTON_REMOVE).click();
    }

    public void isGoneWait(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(IS_GONE));
    }

    public boolean isCheckboxExist(){
        var t = driver.findElements(By.id("checkbox")).size();
        return t > 0;
    }
}
