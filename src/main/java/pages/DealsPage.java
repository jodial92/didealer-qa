package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage {

    WebDriver driver;

    @FindBy(name="keyword")
    WebElement keywordInput;

    @FindBy(name="percentageDiscount")
    WebElement percentageDiscountInput;

    @FindBy(name="startDate")
    WebElement startDateInput;

    @FindBy(name="endDate")
    WebElement endDateInput;

    @FindBy(css="#mat-select-0")
    WebElement shopDropdown;

    String shopLocatorString = "//span[text()='%s']";

    @FindBy(css="div mat-option")
    List<WebElement> allShopOptions;

    @FindBy(xpath="//span[contains(text(),'Search')]")
    WebElement searchButton;

    @FindBy(xpath="//span[contains(text(),'Clear')]")
    WebElement clearButton;
    
    public DealsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DealsPage filterByShopName(String shopName){
        shopDropdown.click();
        driver.findElement(By.xpath(String.format(shopLocatorString, shopName))).click();
        searchButton.click();
        return this;
    }
}
