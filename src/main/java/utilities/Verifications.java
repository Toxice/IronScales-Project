package utilities;

import Actions.Actions;
import Java.Removal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {
    public static void verifyText(WebElement element , String expectedText){
        Wait.until(ExpectedConditions.visibilityOf(element)); // wait for the element to render
        try {
            assertEquals(element.getText(), expectedText);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    public static void verifyTextByAttribute(WebElement element , String Attribute, String Expected){
        Wait.until(ExpectedConditions.visibilityOf(element));
        try {
            assertEquals(element.getAttribute(Attribute), Expected);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    public static void verifyText(String Text , String expected){
        try {
            assertEquals(Text, expected);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    public static void verifyGreaterThan(WebElement element , int Expected){
        try {
              assertTrue(Actions.greaterThan((int) Actions.getNumberFromString(element.getText()), Expected));
        } catch (AssertionError e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void verifyRemove(String string , String expected){
        try {
            assertEquals(expected , Removal.remove(string));
        } catch (AssertionError e)
        {
            System.out.println(e.getMessage());
        }
    }
}
