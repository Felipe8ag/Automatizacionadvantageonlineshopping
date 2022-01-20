package tasks;

import net.serenitybdd.screenplay.Tasks;

public class Navegate {

    public static TheUser option(String elements, String webTables, String add) {
        return Tasks.instrumented(TheUser.class, elements, webTables, add);

    }
    public static TheCalendar option(String widgets, String datePicker) {
        return Tasks.instrumented(TheCalendar.class, widgets, datePicker);
    }
}
