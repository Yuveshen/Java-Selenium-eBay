package au.com.ebay.tests;

import java.util.concurrent.TimeUnit;

//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.After;

//import org.junit.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterMethod;
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

        //String browser = "chrome";
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
        //Assert.assertEquals("Site url is incorrect", url, driver.getCurrentUrl());
    }




/*	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "~//ebay_automation//drivers//geckodriver"); ///Users/yuveshengovender/development/Personal/ebay_automation/drivers
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	}*/

    @AfterClass
    public static void tearDownAfterClass() {
        driver.close();
        //driver.quit();
    }

/*	@BeforeTest
	public void setUp() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(url);
        Assert.assertEquals("Add first product : Cart Quantity is incorrect", url, driver.getCurrentUrl());
	}*/

/*	@AfterMethod
	public void tearDown()  {
        driver.quit();
	}*/

}
