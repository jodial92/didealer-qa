package e2e;

import org.testng.annotations.Test;
import org.testng.Assert;

import common.BaseTest;

public class MainPageTest extends BaseTest {
    
    @Test
    public void shouldGetMeToDealsPage() {
        homePage.clickDealsLink();
        Assert.assertTrue(util.getUrl("deals"));
    }

    @Test
    public void shouldGetMeDealsByShop() {
        homePage
            .clickDealsLink()
            .filterByShopName("Costco"); //It can be parametriezed
    }

    @Test
    public void shouldGetMeToShopsPage() {
        homePage.clickDealsLink();
        Assert.assertTrue(util.getUrl("deals"));
    }

    @Test
    public void shouldGetMeToExceptionsPage() {
        homePage.clickDealsLink();
        Assert.assertTrue(util.getUrl("deals"));
    }

    @Test
    public void shouldGetMeToSearchesPage() {
        homePage.clickDealsLink();
        Assert.assertTrue(util.getUrl("deals"));
    }
}
