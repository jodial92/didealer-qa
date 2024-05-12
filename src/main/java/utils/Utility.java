package utils;

import org.openqa.selenium.WebDriver;

public class Utility {

    WebDriver driver;

    public Utility(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getUrl(String expectedUrl){
        return driver.getCurrentUrl().contains(expectedUrl);
    }
}
