package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userInterfaces.HomePageSQA;
import userInterfaces.WidgetPage;

public class TheCalendar implements Task {
    private String widgets;
    private String datePicker;

    public TheCalendar(String widgets, String datePicker) {
        this.widgets = widgets;
        this.datePicker = datePicker;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Select.theOption(HomePageSQA.WIDGETS, widgets),
               Select.theOption(WidgetPage.DATE_PICKER, datePicker));
    }
}
