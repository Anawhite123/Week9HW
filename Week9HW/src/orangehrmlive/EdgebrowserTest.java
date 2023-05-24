package orangehrmlive;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgebrowserTest {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String expectedTitle ="OrangeHRM";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();//setting web-browser
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();//get title of page
        System.out.println("title of page :"+actualTitle);//sout to print
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver


    }
}
