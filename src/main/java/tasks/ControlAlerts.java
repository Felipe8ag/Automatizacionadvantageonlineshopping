package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static userInterfaces.AlertPage.*;

public class ControlAlerts implements Task {
    private String name;
    private Integer seconds;

    public ControlAlerts(String name, Integer seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Alert.clickButtonAccept(BTN_ALERT_1), WaitAlert.clickButtonAcept(BTN_ALERT_2, seconds)
                , Alert.clickButtonAccept(BTN_ALERT_3), WriteAlert.clickButtonAccept(BTN_ALERT_4, name));
    }

    public static ControlAlerts types(String name, Integer seconds) {
        return Tasks.instrumented(ControlAlerts.class, name, seconds);
    }

}
