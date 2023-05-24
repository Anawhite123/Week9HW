package AvaniProperties;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefoxbrowsertesting {static WebDriver driver;
    static String url = "https://www.avaniproperty.co.uk/properties/";
    static String expectedTitle = "Properties To Rent In Northamptonshire | Homes To Rent";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualtitle = driver.getTitle();
        System.out.println("the title of page    :" +actualtitle);
        Assert.assertTrue(expectedTitle.equals(actualtitle));
        driver.quit();
    }
}

