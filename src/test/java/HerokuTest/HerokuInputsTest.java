package HerokuTest;

import HerokuTest.Base.HerokuBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuInputsTest extends HerokuBaseTest
{
    public WebElement getClickedInput()
    {
        driver.get("https://the-internet.herokuapp.com/inputs");
        var element = driver.findElement(By.cssSelector("input[type='number']"));
        element.click();
        return element;
    }

    @Test
    public void increaseInputTest(){
        var element = getClickedInput();
        element.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(element.getAttribute("value"), "1");
    }

    @Test
    public void decreaseInputTest(){
        var element = getClickedInput();
        element.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(element.getAttribute("value"), "-1");
    }

    @Test
    public void writeNumberInputTest(){
        var element = getClickedInput();
        element.sendKeys("123");
        Assert.assertEquals(element.getAttribute("value"), "123");
    }

    @Test
    public void writeWordInputTest(){
        var element = getClickedInput();
        element.sendKeys("Hello, World!");
        Assert.assertNotEquals(element.getAttribute("value"), "Hello, world!");
    }
}
