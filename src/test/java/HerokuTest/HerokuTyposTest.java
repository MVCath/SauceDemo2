package HerokuTest;

import HerokuTest.Base.HerokuBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HerokuTyposTest extends HerokuBaseTest
{

    public List<WebElement> getTyposList()
    {
        driver.get("https://the-internet.herokuapp.com/typos");
        List<WebElement> typosList = driver.findElements(By.xpath("//p"));
        return typosList;
    }

    @Test
    public void firstTyposTest() {
        var typosList = getTyposList();
        var typosText = typosList.get(0).getText();
        Assert.assertEquals(typosText, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
    }

    @Test
    public void secondTyposTest() {
        var typosList = getTyposList();
        var typosText = typosList.get(1).getText();
        Assert.assertEquals(typosText, "Sometimes you'll see a typo, other times you won't.");
    }
}