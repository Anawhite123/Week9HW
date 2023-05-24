package nopcommersebrowsertesting;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest1 {
    static WebDriver driver;
    static String url ="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String expectedTitle = "nopCommerce demo store. Login";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();//setting web-driver
        driver = new FirefoxDriver(options);
        driver.get(url);//launch URL
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));// giving wait
        String actualTitle =driver.getTitle();//getting title
        System.out.println("Title of page is :"+actualTitle);//printing title page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
