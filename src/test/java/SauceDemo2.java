import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo2 {
 @Test
 public void secretSauce() {
  System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.saucedemo.com/");
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  driver.findElement(By.name("password")).sendKeys("secret_sauce");
  driver.findElement(By.cssSelector("[class=login_logo]"));
  driver.findElement(By.cssSelector("[type=submit]")).click();
  driver.findElement(By.linkText("Twitter"));
  driver.findElement(By.partialLinkText("Linked"));
  driver.findElement(By.tagName("ul"));
  driver.findElement(By.xpath("//meta[@name='robots']"));
  driver.findElement(By.xpath("//footer[contains(@class, 'footer')]"));
  driver.findElement(By.xpath("//div[(text() = 'Sauce Labs Bike Light')]"));
  driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
  driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']"));
  driver.findElement(By.xpath("//div[@class='inventory_item_description']//descendant:: div"));
  driver.findElement(By.xpath("//*[@class='social']//following::li"));
  driver.findElement(By.xpath("//*[@class='inventory_item_price']//parent::div"));
  driver.findElement(By.xpath("//*[@class='inventory_item_price']//preceding::div"));
  driver.findElement(By.xpath("//div[@class='inventory_item_name ' and @data-test='inventory-item-name']"));
  driver.findElement(By.cssSelector(".page_wrapper"));
  driver.findElement(By.cssSelector(".bm-item.menu-item"));
  driver.findElement(By.cssSelector("#page_wrapper"));
  driver.findElement(By.cssSelector(".social .social_twitter"));
  driver.findElement(By.cssSelector("ul"));
  driver.findElement(By.cssSelector("ul.social"));
  driver.findElement(By.cssSelector("[class=social_twitter]"));
 }
}
