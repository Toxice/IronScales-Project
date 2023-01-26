package tests.Web;

import Actions.WebActions;
import Flows.WebFlows;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
public class SolutionWeb extends CommonOps {

    @Test
    public void test01_validate_starter_tab(){
        WebActions.hoverElements(navigationBar.SolutionTab , navigationBar.PlanTab);

        WebActions.hoverElement(navigationBar.Starter); 

        Verifications.verifyText(navigationBar.Starter , "Starter™");
    }

    @Test
    public void test02_validate_email_tab(){


        WebFlows.getSolutionTab(navigationBar.emailProtect);

        Verifications.verifyText(navigationBar.emailProtect, "Email Protect™");
    }

    @Test
    public void test03_validate_protect_tab() {
        WebFlows.getSolutionTab(navigationBar.completeProtect);

        Verifications.verifyText(navigationBar.completeProtect, "Complete Protect™");
    }
}
