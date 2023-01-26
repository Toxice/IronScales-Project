package tests.Websites;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;
public class InstagramWeb extends CommonOps {
    @Test
    public void test01_instagram(){
        WebActions.Scroll(Iconic.Instagram);

        Verifications.verifyTextByAttribute(Iconic.Instagram ,"id" ,"Instagram5_layer");
    }

    @Test
    public void test02_open_instagram(){
        WebFlows.getLink(Iconic.instagramLink);

        Verifications.verifyText(driver.getCurrentUrl() , "https://www.instagram.com/ironscalesltd/");
    }
}
