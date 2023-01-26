package pageobjects.IronScales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage {

    @FindBy(xpath = "//div[@class='col-md-18']/div/div[3][@class='col-md-24']/p/ul[2]/li[2][text()='2+ year of experience in Test Automation']")
    public WebElement Position_Year;

    @FindBy(xpath = "//tr[@data-automation='featured-opportunity']")
    public WebElement AutomationPosition;
}
