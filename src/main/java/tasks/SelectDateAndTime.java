package tasks;
import io.cucumber.datatable.DataTable;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.Map;

import static userInterfaces.WidgetPage.*;
public class SelectDateAndTime implements Task {
    private Map<String, String> information;

    public SelectDateAndTime(Map <String, String> date) {
        information = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DATEANDTIME),
                Click.on(MONTH2), Click.on(MONTH_OPTION2.of(information.get("month"))),
                Click.on(YEAR2), Click.on(YEAR_OPTION2.of(information.get("year"))),
                Click.on(HOUR_OPTION.of(information.get("hour")))
        );

    }

}