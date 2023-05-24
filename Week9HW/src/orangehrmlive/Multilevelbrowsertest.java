package orangehrmlive;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Multilevelbrowsertest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String expectedTitles = "OrangeHRM";



    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){// use of if else method as we have to check with three browser;
                                                           // need to set web-browser multiple time
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();//web driver
            driver = new EdgeDriver(options);//setting value to variable
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }else {
            System.out.println("invalid number");
        }


        driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            String actualTitle = driver.getTitle();//getting title by calling get method
        System.out.println("title of page is  :"+ actualTitle);
        Assert.assertTrue(expectedTitles.equals(actualTitle));
        driver.quit();
        }}


