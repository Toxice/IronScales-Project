package Flows;

import Actions.WebActions;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class WebFlows extends CommonOps {
    public static void getSolutionTab(WebElement element){
        WebActions.hoverElements(navigationBar.SolutionTab , navigationBar.PlanTab);

        WebActions.hoverElement(element); // Starter, Email, Protect
    }

    public static void getPositions(){
        WebActions.hoverElements(navigationBar.CompanyTab , navigationBar.careersTab);

        WebActions.Click(navigationBar.careersTab);

        WebActions.Click(navigationBar.openPositions);
    }

    public static void getLink(WebElement element){
        driver.get(element.getAttribute("href"));
    }
}
