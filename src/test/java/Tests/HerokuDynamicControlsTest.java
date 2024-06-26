package Tests;

import Tests.Base.BaseHerokuTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HerokuDynamicControlsTest extends BaseHerokuTest {
    @Test
    public void herokuDynamicControls() {
        herokuDynamicControlPage.open();
        herokuDynamicControlPage.clickButtonRemove();
        herokuDynamicControlPage.isGoneWait();
        var isCheckboxExist = herokuDynamicControlPage.isCheckboxExist();
        Assert.assertEquals(isCheckboxExist, false);
    }
}
