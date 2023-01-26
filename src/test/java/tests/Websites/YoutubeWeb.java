package tests.Websites;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;
public class YoutubeWeb extends CommonOps {
        @Test
        public void test01_youtube(){
            WebActions.Scroll(Iconic.YouTube);

            Verifications.verifyTextByAttribute(Iconic.YouTube ,"id", "YouTube2_layer");
        }

        @Test
        public void test02_open_youtube(){
            WebFlows.getLink(Iconic.youtubeLink);

            Verifications.verifyText(driver.getCurrentUrl() , "https://www.youtube.com/@ironscales4137");
        }
}
