package Shayona;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edgebrowsertest {
    static WebDriver driver;

    static String url = "https://www.shayonastore.com/user/account/login";
    static String expectedtitle ="Customer Login";

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


