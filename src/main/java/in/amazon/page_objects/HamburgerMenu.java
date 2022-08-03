package in.amazon.page_objects;

import in.amazon.actions.HelperMethods;
import in.amazon.base_package.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenu extends BaseClass {

    HelperMethods helperMethods = new HelperMethods();

    //all elements for hamburger menu (in theory you would have all elements of the menu in this class)
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerMenuIcon;

    //elements in the "Shop By Department" section\
    @FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
    WebElement tvAudioAndCamerasOption;

    //sub option
    @FindBy(linkText = "Televisions")
    WebElement televisionsOption;

    public HamburgerMenu() {
        PageFactory.initElements(driver, this);
    }

    public HamburgerMenu clickHamburgerMenu() {
        helperMethods.click(driver, hamburgerMenuIcon);
        HelperMethods.waitFor(3000);
        return new HamburgerMenu();
    }

    public HamburgerMenu clickTvAudioAndCamerasOption() {
        helperMethods.click(driver, tvAudioAndCamerasOption);
        HelperMethods.waitFor(3000);
        return new HamburgerMenu();
    }

    public SearchResultsPage clickTelevisionsOption() {
        helperMethods.click(driver, televisionsOption);
        HelperMethods.waitFor(3000);
        return new SearchResultsPage();
    }
}
