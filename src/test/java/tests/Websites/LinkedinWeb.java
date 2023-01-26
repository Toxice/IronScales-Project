package tests.Websites;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;
public class LinkedinWeb extends CommonOps {
    @Test
    public void test01_linkedin() {
        WebActions.Scroll(Iconic.Linkedin);

        Verifications.verifyTextByAttribute(Iconic.Linkedin ,"id" , "LinkedIn In1_layer");
    }

    @Test
    public void test02_open_linkedin(){
       WebFlows.getLink(Iconic.linkedinLink);

        Verifications.verifyText(driver.getCurrentUrl() , "https://www.linkedin.com/company/ironscales/");
    }
}
