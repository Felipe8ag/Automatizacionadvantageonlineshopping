package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userInterfaces.ElementsPage.*;

public class DeleteUser implements Task {
    private String last_name;

    public DeleteUser(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(last_name).into(SEARCHBOX),
                Click.on(TRASH));
    }

    public static DeleteUser withLastName(String last_name) {
        return Tasks.instrumented(DeleteUser.class, last_name);
    }
}
