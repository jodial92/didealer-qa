package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.HomePage;
import utils.Utility;

public class BaseTest {

	public WebDriver driver;
    public Utility util;
    public HomePage homePage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://deals.didealer.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //System.out.println(driver.getTitle()); //Gets page title. Could be asserted
        homePage = new HomePage(driver);
        util = new Utility(driver);
    }

    @AfterTest
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }
	
    //For future use
	public void createDriver(String browser, String url) throws Exception {
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
			driver = new ChromeDriver();
			break;
        case "edge":
            //implement logic
            break;
        case "safari":
            //Implement logic
            break;
		default:
            throw new Exception("Incorrect Browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
}