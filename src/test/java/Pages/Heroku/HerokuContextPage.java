package Pages.Heroku;

import Pages.Base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HerokuContextPage extends BasePage {

    private final By RIGHT_CLICK = By.id("hot-spot");

    public HerokuContextPage(WebDriver driver) {
        super(driver);
    }

    public void open () {
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void rightClickOnPlace(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(RIGHT_CLICK);
        action.contextClick(element).perform();
    }

    public void closeAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
