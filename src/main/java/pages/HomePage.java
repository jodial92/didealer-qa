package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(css="a[routerlink='/deals']")
    WebElement dealsLink;

    @FindBy(css="a[routerlink='/shops']")
    WebElement shopsLink;

    @FindBy(css="a[routerlink='/exceptions']")
    WebElement exceptionsLink;

    @FindBy(css="a[routerlink='/searches']")
    WebElement searchesLink;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DealsPage clickDealsLink() {
        dealsLink.click();
        return new DealsPage(driver);
    }

    public ShopsPage clicShopsLink() {
        shopsLink.click();
        return new ShopsPage(driver);
    }

    public ExceptionsPage clickExceptionsLink() {
        exceptionsLink.click();
        return new ExceptionsPage(driver);
    }

    public SearchesPage clickSearchesLink() {
        searchesLink.click();
        return new SearchesPage(driver);
    }
}
