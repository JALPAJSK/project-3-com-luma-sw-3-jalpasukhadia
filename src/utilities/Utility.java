package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     */

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    /**
     * This method will get text from element
     */
    public String getTextElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverElement(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).build().perform();

    }
    /**
     * This method will mouse hover over element and click
     */
    public void mouseHoverAndClick(By by) {
        Actions actions = new Actions(driver); //Create object of alert class
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    /**
     * This method will verify text
     */

    public void verifyText(String displayMessage, String expectedText, String actualText) {
        Assert.assertEquals(displayMessage, expectedText, actualText);
    }
    /**
     * This method is used to select the option from drop down menu
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}


