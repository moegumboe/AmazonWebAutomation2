package in.amazon.page_objects;

import in.amazon.actions.HelperMethods;
import in.amazon.base_package.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BaseClass {

    @FindBy(css = "div.a-column.a-span12:nth-of-type(2) div div div.a-section:nth-of-type(21) li:nth-of-type(3) i")
    WebElement samsungCheckbox;

    @FindBy(css = "div.s-matching-dir span div.s-main-slot div.sg-col-4-of-12:nth-of-type(3) div.a-section.a-spacing-small div.a-section:nth-of-type(1) a")
    WebElement secondTvInList;

    @FindBy(css = "span.a-dropdown-prompt")
    WebElement sortDropdown;

    @FindBy(css = "div.a-popover-inner  li:nth-of-type(2) a")
    WebElement priceLowToHigh;

    @FindBy(css = "div.a-popover-inner  li:nth-of-type(3) a")
    WebElement priceHighToLow;


    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage addFilter() {
        samsungCheckbox.click();
        HelperMethods.waitFor(3000);
        return new SearchResultsPage();
    }

    /*
    you can parameterize this method to be able to select a certain dropdown
     */
    public SearchResultsPage sortBy(String sortOption) {
        sortDropdown.click();
        switch(sortOption.toLowerCase()) {
            case "high to low":
                priceHighToLow.click();
                break;
            case "low to high":
                priceLowToHigh.click();
                break;
            default:
                System.out.println(sortOption + " is not a valid input.");
        }
        HelperMethods.waitFor(3000);
        return new SearchResultsPage();
    }

    public ItemDetailsPage selectItem() {
        secondTvInList.click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        return new ItemDetailsPage();
    }


}
