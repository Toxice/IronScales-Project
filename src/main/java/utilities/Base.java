package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.IronScales.CareersPage;
import pageobjects.IronScales.IconPage;
import pageobjects.IronScales.NavBar;

import java.util.ArrayList;
import java.util.List;

public class Base {
    // Selenium
    protected static WebDriver driver; // a WebDriver object
    protected static WebDriverWait Wait; // a WebDriverWait object
    protected static Actions Action; // an Actions object

    // Page Objects

    protected static NavBar navigationBar;
    protected static CareersPage applyPage;

    protected static IconPage Iconic;
}
