package interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    private Integer seconds;

    public Wait(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(seconds * 1000);
    }

    public static Wait until(Integer seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }

}
