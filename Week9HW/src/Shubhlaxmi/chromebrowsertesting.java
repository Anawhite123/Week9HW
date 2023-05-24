package Shubhlaxmi;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class chromebrowsertesting {
    static WebDriver driver;
    static String url = "https://shubhlaxmianand.com/";
    static String expectedtitle ="Recharge your Emotions – Online Clothing in Anand Gujara";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("the title of the page   :"+actualTitle);
        Assert.assertTrue(expectedtitle.equals(actualTitle));
    }
}

