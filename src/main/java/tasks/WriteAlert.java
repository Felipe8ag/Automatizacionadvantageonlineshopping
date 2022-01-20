package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class WriteAlert implements Task {

    private Target target;
    private String name;

    public WriteAlert(Target target, String name) {
        this.name = name;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
        BrowseTheWeb.as(actor).getAlert().sendKeys(name);
        BrowseTheWeb.as(actor).getAlert().accept();
    }

    public static WriteAlert clickButtonAccept(Target target, String name) {
        return Tasks.instrumented(WriteAlert.class, target, name);
    }
}
