package au.com.ebay.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestSuite {

    protected static WebDriver driver;
    static String url = "https://www.ebay.com.au/";

    @Parameters("browser")

    @BeforeClass
    // Passing Browser parameter from TestNG xml
    public static void setUpBeforeClass(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        driver.close();
    }

}
