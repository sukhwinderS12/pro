import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Sukh {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sukhwinder\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
    }

    @Test
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertTrue(logo.isDisplayed(),"not displaying page");
    }
    @Test
    void Button() {
        List<WebElement> button = driver.findElements(By.tagName("button"));
        System.out.println("Button:" + button.size());
    }
    @Test
    void Image() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("images:" + images.size());
    }


}
