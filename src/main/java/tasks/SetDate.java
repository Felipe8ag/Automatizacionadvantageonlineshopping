package tasks;

import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class SetDate {
    public static SelectDate with(Map<String, String> data) {
        return Tasks.instrumented(SelectDate.class, data);
    }

    public static SelectDateAndTime withTime(Map<String, String> data) {
        return Tasks.instrumented(SelectDateAndTime.class, data);
    }
}
