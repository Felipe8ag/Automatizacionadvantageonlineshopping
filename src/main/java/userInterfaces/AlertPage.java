package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlertPage extends PageObject {

    public static final Target ALERTS_FRAME = Target.the("Web_Table").locatedBy("//*[text()='Alerts, Frame & Windows']");
    public static final Target ALERTS = Target.the("Select_Date").locatedBy("//*[text()='Alerts']");
    public static final Target BTN_ALERT_1 = Target.the("Alert Button 1").locatedBy("id:alertButton");
    public static final Target BTN_ALERT_2 = Target.the("Alert Button 2").locatedBy("id:timerAlertButton");
    public static final Target BTN_ALERT_3 = Target.the("Alert Button 3").locatedBy("id:confirmButton");
    public static final Target BTN_ALERT_4 = Target.the("Alert Button 4").locatedBy("id:promtButton");
}
