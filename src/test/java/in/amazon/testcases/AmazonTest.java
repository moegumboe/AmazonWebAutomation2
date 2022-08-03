package in.amazon.testcases;

import in.amazon.base_package.BaseClass;
import in.amazon.page_objects.HamburgerMenu;
import in.amazon.page_objects.ItemDetailsPage;
import in.amazon.page_objects.SearchResultsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest extends BaseClass {

    HamburgerMenu hamburgerMenu;
    SearchResultsPage searchResultsPage;
    ItemDetailsPage itemDetailsPage;

    @BeforeMethod()
    public void setup() {
        launchApplication();
    }

    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void verifyItemDetails() {
        itemDetailsPage = new ItemDetailsPage();
        hamburgerMenu = new HamburgerMenu();
        searchResultsPage = new SearchResultsPage();
        hamburgerMenu.clickHamburgerMenu().clickTvAudioAndCamerasOption().clickTelevisionsOption();
        searchResultsPage.addFilter();
        searchResultsPage.sortBy("High To Low").selectItem();
        if(itemDetailsPage.isAboutThisVisible()) {
            for (String desc: itemDetailsPage.productDescriptionList()) {
                System.out.println(desc);
            }
        }

    }


}
