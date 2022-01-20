package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidateDateOf;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class PruebaSqa2StepDefinition {

    @Given("Desea seleccionar la opcion de {string} y {string}")
    public void deseaSeleccionarLaOpcionDeY(String widgets, String datePicker) {
        theActorInTheSpotlight().attemptsTo(Navegate.option(widgets,datePicker));
    }
    @When("Ingresa la fecha con hora")
    public void ingresaLaFechaConHora(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(Fill.theDate(dataTable));
    }
    @Then("Valida que la fecha {string} exista")
    public void valida_que_la_fecha_exista(String date) {
        theActorInTheSpotlight().should(seeThat(ValidateDateOf.en(), equalTo(date)));
    }
}
