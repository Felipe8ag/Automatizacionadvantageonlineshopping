package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationTextOf implements Question<String> {

    String text;
    Target 	target;

    public ValidationTextOf(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target.of(text)).viewedBy(actor).asString();
    }

    public static ValidationTextOf en (String text, Target target){
        return new ValidationTextOf(text, target);
    }
}
