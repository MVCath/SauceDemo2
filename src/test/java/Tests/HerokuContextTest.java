package Tests;

import Tests.Base.BaseHerokuTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuContextTest extends BaseHerokuTest {
    @Test
    public void herokuContext() {
        herokuContextPage.open();
        herokuContextPage.rightClickOnPlace();
        herokuContextPage.closeAlert();
    }
}
