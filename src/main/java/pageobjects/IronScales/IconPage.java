package pageobjects.IronScales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;

public class IconPage {
    @FindBy(xpath = "//*[@id='LinkedIn In1_layer']")
    public WebElement Linkedin;

    @FindBy(xpath = "//*[@id='YouTube2_layer']")
    public WebElement YouTube;

    @FindBy(xpath = "//*[@id='Twitter3_layer']")
    public WebElement Twitter;

    @FindBy(xpath = "//*[@id='Facebook F4_layer']")
    public WebElement Facebook;

    @FindBy(xpath = "//*[@id='Instagram5_layer']")
    public WebElement Instagram;

    @FindBy(xpath = "//a[@class='no-decoration'][@href='https://www.linkedin.com/company/ironscales/']")
    public WebElement linkedinLink;

    @FindBy(xpath = "//a[@class='no-decoration'][@href='https://www.youtube.com/@ironscales4137']")
    public WebElement youtubeLink;

    @FindBy(xpath = "//a[@class='no-decoration'][@href='https://twitter.com/IRONSCALES']")
    public WebElement twitterLink;

    @FindBy(xpath = "//a[@class='no-decoration'][@href='https://www.linkedin.com/company/ironscales/']")
    public WebElement facebookLink;

    @FindBy(xpath = "//a[@class='no-decoration'][@href='https://www.instagram.com/ironscalesltd/']")
    public WebElement instagramLink;
}
