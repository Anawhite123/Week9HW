package Next;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiplebrowserTesting {

    static String browser ="firefox";
    static WebDriver driver;
    static String url = "https://www.next.co.uk/secure/account/Login";
    static String expectedTitle = "Sign In | My Account | Next Directory Online";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }else{
            System.out.println("invalid input");

            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
            String actualTitle = driver.getTitle();
            System.out.println("the title of page  " +actualTitle);
            Assert.assertTrue(expectedTitle.equals(actualTitle));
            driver.quit();
        }

    }
    }
