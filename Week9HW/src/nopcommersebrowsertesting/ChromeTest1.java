package nopcommersebrowsertesting;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest1 {

    static WebDriver driver;

    static String url ="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String expectedTitle = "nopCommerce demo store. Login";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle = driver.getTitle();
        System.out.println("title of page is: "+actualTitle);//printing title
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
