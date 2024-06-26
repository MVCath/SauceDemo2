package Tests.Base;

import Pages.Heroku.HerokuContextPage;
import Pages.Heroku.HerokuDynamicControlPage;
import Pages.Heroku.HerokuFramePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseHerokuTest {
    public WebDriver driver;
    public HerokuContextPage herokuContextPage;
    public HerokuFramePage herokuFramePage;
    public HerokuDynamicControlPage herokuDynamicControlPage;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        herokuContextPage = new HerokuContextPage(driver);
        herokuFramePage = new HerokuFramePage(driver);
        herokuDynamicControlPage = new HerokuDynamicControlPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void close(){
        driver.quit();
    }
}
