package utilities;

import org.openqa.selenium.support.PageFactory;
import pageobjects.IronScales.CareersPage;
import pageobjects.IronScales.IconPage;
import pageobjects.IronScales.NavBar;

public class PageObjectManager extends Base{

    public static void initPageObject(){

        navigationBar = PageFactory.initElements(driver , NavBar.class);

        applyPage = PageFactory.initElements(driver , CareersPage.class);

        Iconic = PageFactory.initElements(driver , IconPage.class);
    }

}
