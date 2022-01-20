package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userInterfaces.ElementsPage;
import userInterfaces.HomePageSQA;

public class TheUser implements Task {

    private String elements;
    private String webTables;
    private String add;

    public TheUser(String elements, String webTables, String add) {
        this.elements = elements;
        this.webTables = webTables;
        this.add = add;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.theOption(HomePageSQA.ELEMENTS, elements),
                Select.theOption(ElementsPage.WEBTABLE, webTables),
                Select.theOption(ElementsPage.ADD, add)
        );

    }


}
