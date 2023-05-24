package AvaniProperties;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edgebrowsertesting {static WebDriver driver;

    static String url = "https://www.avaniproperty.co.uk/properties/";
    static String expectedtitle ="Properties To Rent In Northamptonshire | Homes To Rent";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver= new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("the title page   :"+actualTitle);
        Assert.assertTrue(expectedtitle.equals(actualTitle));
    }
}
