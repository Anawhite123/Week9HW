package Herokuapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edgebrowsertest {
    static WebDriver driver;
    static String url ="http://the-internet.herokuapp.com/login";
    static String expectedTitle ="Login";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2222));
        String actualTitle = driver.getTitle();
        System.out.println("title of the page is:  "+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver


    }
}


