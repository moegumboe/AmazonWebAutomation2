package in.amazon.page_objects;

import in.amazon.actions.HelperMethods;
import in.amazon.base_package.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ItemDetailsPage extends BaseClass {

    HelperMethods helperMethods = new HelperMethods();

    @FindBy(css = "div#feature-bullets")
    WebElement aboutThisItemTitle;

    @FindBy(css = "div#feature-bullets li")
    List<WebElement> aboutThisItemDescription;

    public ItemDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isAboutThisVisible() {
        return aboutThisItemTitle.isDisplayed();
    }

    public List<String> productDescriptionList() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement listOfBullet : aboutThisItemDescription) {
            productDescription.add(listOfBullet.getText());
        }
        return productDescription;
    }

}
