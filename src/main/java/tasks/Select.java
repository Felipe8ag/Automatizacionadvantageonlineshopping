package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Task {
    String option;
    Target target;

    public Select(Target target, String option) {
        this.option = option;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new ScrollToTarget(target));
        actor.attemptsTo(Click.on(target.of(option)));

    }

    public static Select theOption(Target target, String option) {
        return Tasks.instrumented(Select.class, target, option);
    }

}
