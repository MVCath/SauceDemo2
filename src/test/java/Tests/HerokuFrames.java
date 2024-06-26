package Tests;

import Tests.Base.BaseHerokuTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuFrames extends BaseHerokuTest {
    @Test
    public void herokuContext() {
        herokuFramePage.open();
        herokuFramePage.clickIFrame();
        herokuFramePage.waitAlert();
        herokuFramePage.closeNotificationAlert();
        herokuFramePage.switchToFrameByIndex(0);
        var contentText = herokuFramePage.getContextString();
        Assert.assertEquals(contentText, "Your content goes here.");
    }
}
