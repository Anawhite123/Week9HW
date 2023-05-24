package Next;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

//https://www.next.co.uk/secure/account/Login
public class Chromebrowsertesting {
    static WebDriver driver;
    static String url = "https://www.next.co.uk/secure/account/Login";
    static String expectedtitle ="Sign In | My Account | Next Directory Online";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("the title page   :"+actualTitle);
        Assert.assertTrue(expectedtitle.equals(actualTitle));
    }
}
