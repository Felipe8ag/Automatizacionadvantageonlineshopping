package tasks;

import io.cucumber.datatable.DataTable;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static userInterfaces.ElementsPage.*;

public class CreateUser implements Task {

    private DataTable data;
    private Map<String, String> information;
    private User user;

    public CreateUser(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        user = new User(information.get("first_name"), information.get("last_name"), information.get("email"),
                information.get("age"), information.get("salary"), information.get("department"));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirst_name()).into(FIRST_NAME),
                Enter.theValue(user.getLast_name()).into(LAST_NAME),
                Enter.theValue(user.getEmail()).into(EMAIL),
                Enter.theValue(user.getAge()).into(AGE),
                Enter.theValue(user.getSalary()).into(SALARY),
                Enter.theValue(user.getDepartment()).into(DEPARTMENT),
                Click.on(SUBMIT));

    }

    public static CreateUser withData(DataTable data) {
        return Tasks.instrumented(CreateUser.class, data);
    }
}
