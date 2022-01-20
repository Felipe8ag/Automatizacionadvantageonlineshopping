package tasks;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class WaitAlert implements Task {
    private Target target;
    private Integer seconds;

    public WaitAlert(Target target, Integer seconds) {
        this.target = target;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target), Wait.until(6));
        BrowseTheWeb.as(actor).getAlert().accept();
    }
    public static WaitAlert clickButtonAcept(Target target, Integer seconds) {
        return Tasks.instrumented(WaitAlert.class, target, seconds);
    }
}
