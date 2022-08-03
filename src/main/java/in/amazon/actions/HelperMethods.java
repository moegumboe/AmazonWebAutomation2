package in.amazon.actions;

import in.amazon.base_package.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class HelperMethods extends BaseClass {
    
    public static void waitFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(WebDriver driver, WebElement ele) {

        Actions act = new Actions(driver);
        act.moveToElement(ele).click().build().perform();
    }

    public boolean isDisplayed(WebDriver driver, WebElement ele) {
        boolean flag = false;
        flag = driver.findElement((By) ele).isDisplayed();
        return flag;
    }

    public boolean type(WebElement ele, String text) {
        boolean flag = false;
        try {
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }

        }
        return flag;
    }

    public boolean selectByVisibleText(String visibletext, WebElement ele) {
        boolean flag = false;
        try {
            Select s = new Select(ele);
            s.selectByVisibleText(visibletext);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by VisibleText");
            } else {
                System.out.println("Option not selected by VisibleText");
            }
        }
    }

    public void fluentWait(WebDriver driver,WebElement element, int timeOut) {
        Wait<WebDriver> wait = null;
        try {
            wait = new FluentWait<WebDriver>((WebDriver) driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(Exception.class);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception e) {
        }
    }

}
