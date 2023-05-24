package saucedemo;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edgebrowsertesting {
    static WebDriver driver;// static variables
    static String url = "https://www.saucedemo.com/";
    static String expectedTitle ="Swag labs";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();//setting web driver
        driver = new EdgeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("title of page :"+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}

