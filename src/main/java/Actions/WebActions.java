package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

public class WebActions extends CommonOps {
    public static void Click(WebElement element){
        Wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void hoverElement(WebElement element){
        Wait.until(ExpectedConditions.visibilityOf(element));

        Action.moveToElement(element).build().perform();
    }

    public static void hoverElements(WebElement elem1 , WebElement elem2){
        Wait.until(ExpectedConditions.visibilityOf(elem1));

        Action.moveToElement(elem1).moveToElement(elem2).build().perform();
    }

    public static void Scroll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
