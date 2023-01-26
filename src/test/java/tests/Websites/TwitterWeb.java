package tests.Websites;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;
public class TwitterWeb extends CommonOps {
    @Test
    public void test01_twitter(){
        WebActions.Scroll(Iconic.Twitter);

        Verifications.verifyTextByAttribute(Iconic.Twitter ,"id" ,"Twitter3_layer");
    }

    @Test
    public void test02_open_twitter(){
       WebFlows.getLink(Iconic.twitterLink);

        Verifications.verifyText(driver.getCurrentUrl() , "https://twitter.com/IRONSCALES");
    }
}
