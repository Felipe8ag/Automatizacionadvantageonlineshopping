package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class Fill implements Task {
    private Map <String,String> date;

    public Fill(DataTable date) {
        this.date = date.asMap(String.class,String.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SetDate.with(date),SetDate.withTime(date));

    }

    public static Fill theDate(DataTable data) {
        return Tasks.instrumented(Fill.class, data);
    }

}
