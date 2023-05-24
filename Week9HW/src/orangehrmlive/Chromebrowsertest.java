package orangehrmlive;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Chromebrowsertest {
    static WebDriver driver;// static variables
    static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String expectedTitle ="OrangeHRM";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();//setting web driver
        driver = new ChromeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("title of page :"+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
