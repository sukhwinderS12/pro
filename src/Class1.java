import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class1 {
    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukhwinder\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
    }

    @Test
    void Title() {
        String title = driver.getTitle();
        Assert.assertEquals("opensourcecms – Just another WordPress site", title, "tittle not matchh");

    }
    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertTrue(logo.isDisplayed(), "logo not displayed on the page");
    }


}
