package Pages.Heroku;

import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuFramePage extends BasePage {

    private final By IFRAME_PATH = By.xpath("//a[text()='iFrame']");
    private final By NOTIFICATION_BUTTON_PATH = By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']");
    private final By CONTEXT_STRING_PATH = By.xpath("//p");

    public HerokuFramePage(WebDriver driver) {
        super(driver);
    }

    public void open () {
        driver.get("https://the-internet.herokuapp.com/frames");
    }

    public void clickIFrame(){
        driver.findElement(IFRAME_PATH).click();
    }

    public void closeNotificationAlert()
    {
        WebElement button = driver.findElement(NOTIFICATION_BUTTON_PATH);
        button.click();
    }

    public void switchToFrameByIndex(Integer index){
        driver.switchTo().frame(index);
    }

    public String getContextString() {
        var contentText = driver.findElement(CONTEXT_STRING_PATH).getText();
        return contentText;
    }

    public void waitAlert(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(NOTIFICATION_BUTTON_PATH));
    }
}
