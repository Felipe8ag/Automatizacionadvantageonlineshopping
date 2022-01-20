package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import tasks.ControlAlerts;
import tasks.Select;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userInterfaces.AlertPage.ALERTS;
import static userInterfaces.AlertPage.ALERTS_FRAME;
import static utilities.Constants.NUMBER_SIX;

public class PruebaSqa3StepDefinition {

    @Given("Desea seleccionar la opcion de {string} y luego {string}")
    public void deseaSeleccionarLaOpcionDeYLuego(String alertsFrame, String alerts) {
        theActorInTheSpotlight().attemptsTo(Select.theOption(ALERTS_FRAME, alertsFrame),
                Select.theOption(ALERTS, alerts));
    }

    @When("Interactua con las Alertas y escribe el texto {string}")
    public void interactuaConLasAlertasYEscribeElTexto(String name) {
        theActorInTheSpotlight().attemptsTo(ControlAlerts.types(name, NUMBER_SIX));

    }

}
