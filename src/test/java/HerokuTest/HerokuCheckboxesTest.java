package HerokuTest;

import HerokuTest.Base.HerokuBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HerokuCheckboxesTest extends HerokuBaseTest
{
    public List<WebElement> getCheckBoxList()
    {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
        return checkboxList;
    }

    @Test
    public void firstCheckBoxUncheckedTest()
    {
        List<WebElement> checkboxList = getCheckBoxList();
        var firstCheckBox = checkboxList.get(0);
        Assert.assertEquals(firstCheckBox.isSelected(), false);
    }

    @Test
    public void firstCheckBoxCheckedAfterClickTest()
    {
        List<WebElement> checkboxList = getCheckBoxList();
        var firstCheckBox = checkboxList.get(0);
        firstCheckBox.click();
        Assert.assertEquals(firstCheckBox.isSelected(), true);
    }

    @Test
    public void secondCheckBoxCheckedTest()
    {
        List<WebElement> checkboxList = getCheckBoxList();
        var secondCheckBox = checkboxList.get(1);
        Assert.assertEquals(secondCheckBox.isSelected(), true);
    }

    @Test
    public void secondCheckBoxUncheckedAfterClickTest()
    {
        List<WebElement> checkboxList = getCheckBoxList();
        var secondCheckBox = checkboxList.get(1);
        secondCheckBox.click();
        Assert.assertEquals(secondCheckBox.isSelected(), false);
    }
}
