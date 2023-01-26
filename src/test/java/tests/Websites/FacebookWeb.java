package tests.Websites;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;

import static org.testng.Assert.fail;
public class FacebookWeb extends CommonOps {
    @Test
    public void test01_facebook(){
        WebActions.Scroll(Iconic.Facebook);

        Verifications.verifyTextByAttribute(Iconic.Facebook ,"id" ,"Facebook F4_layer");
    }

    @Test
    public void test02_open_facebook(){
       WebFlows.getLink(Iconic.facebookLink);

        Verifications.verifyText(driver.getCurrentUrl(), "https://www.facebook.com/ironscalesltd");
    }
}
