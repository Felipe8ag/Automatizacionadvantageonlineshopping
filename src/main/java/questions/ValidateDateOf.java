package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import static userInterfaces.WidgetPage.DATE_VALIDATE;

public class ValidateDateOf implements Question {

    public ValidateDateOf() {

    }
    @Override
    public String answeredBy(Actor actor) {
        return Value.of(DATE_VALIDATE).viewedBy(actor).asString();
    }
    public static ValidateDateOf en (){
        return new ValidateDateOf();
    }

}
