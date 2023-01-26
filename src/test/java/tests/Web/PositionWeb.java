package tests.Web;

import Actions.WebActions;
import Flows.WebFlows;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Verifications;


public class PositionWeb extends CommonOps {
    @Test
    public void test_validate_year()  {
        WebFlows.getPositions();

        WebActions.Click(applyPage.AutomationPosition);

        WebActions.Scroll(applyPage.Position_Year);

        Verifications.verifyGreaterThan(applyPage.Position_Year, 1);
    }
}
