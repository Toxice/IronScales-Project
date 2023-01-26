package pageobjects.IronScales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class NavBar {

    @FindBy(xpath = "//div[@id='navbar_global']")
    public WebElement NavBar; // the web element of the entire nav bar

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[1]/a/span[text()='Solution']")
    public WebElement SolutionTab; // the web element for the solution tab

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[1]/ul/li/a[text()='By Plan']")
    public WebElement PlanTab;

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[1]/ul/li[2]/ul/li/a[text()='Starter™']")
    public WebElement Starter;

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[1]/ul/li[2]/ul/li/a[text()='Email Protect™']")
    public WebElement emailProtect;

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[1]/ul/li[2]/ul/li/a[text()='Complete Protect™']")
    public WebElement completeProtect;

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[6]/a/span[text()='Company']")
    public WebElement CompanyTab;

    @FindBy(xpath = "//div[@id='navbar_global']/div/ul[1]/li[6]/ul/li[7]/a[text()='Careers']")
    public WebElement careersTab;

    @FindBy(xpath = "//a[text()='Job Openings']")
    public WebElement openPositions;

    @FindBy(xpath = "//button[@data-test-id='picklist-option'][3]")
    public WebElement chatButton;

    @FindBy(xpath = "//button[@data-test-id='close-button']")
    public WebElement closeButton;
}
