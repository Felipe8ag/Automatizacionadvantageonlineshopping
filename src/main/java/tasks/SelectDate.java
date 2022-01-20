package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterfaces.WidgetPage.*;

import java.util.Map;

public class SelectDate implements Task {

    private Map<String, String> information;

    public SelectDate(Map<String, String> date) {
        information = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DATE),
                Click.on(MONTH),Click.on(MONTH_OPTION.of(information.get("month"))),
                Click.on(YEAR),Click.on(YEAR_OPTION.of(information.get("year"))),
                Click.on(DAY_OPTION.of(information.get("day")))
        );
    }

}
