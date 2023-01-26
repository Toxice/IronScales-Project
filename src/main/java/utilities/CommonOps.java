package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    @BeforeClass
    public static void startSession(){
        driver = initChrome();

        driver.manage().window().maximize(); // maximizing the browser window
        driver.navigate().to("https://ironscales.com/"); // navigating to the IronScales home page

        Action = new Actions(driver); // initializing the Actions object

        Wait = new WebDriverWait(driver , 10);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        PageObjectManager.initPageObject(); // initialize the page objects
    }

    @AfterMethod
    public void refreshScene() {
        driver.navigate().to("https://ironscales.com/");
    }

    @AfterClass
    public void endSession() {
        driver.close();
    }

    public static WebDriver initChrome() // functions used to initialize the chrome driver
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    }

