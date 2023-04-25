package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    //This method will click on element

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //This method will send text element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //this method will get Text from element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }



    
}
