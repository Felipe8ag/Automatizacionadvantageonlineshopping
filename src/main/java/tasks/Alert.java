package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class Alert implements Task {
    private Target target;

    public Alert(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
        BrowseTheWeb.as(actor).getAlert().accept();
        actor.attemptsTo(WaitUntil.the(target, isClickable()).forNoMoreThan(6).seconds());
    }

    public static Alert clickButtonAccept(Target target) {
        return Tasks.instrumented(Alert.class, target);
    }


}
