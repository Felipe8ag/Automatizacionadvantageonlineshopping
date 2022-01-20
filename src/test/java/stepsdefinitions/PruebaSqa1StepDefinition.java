package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidationTextOf;
import tasks.CreateUser;
import tasks.DeleteUser;
import tasks.Navegate;
import tasks.TheUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.StringContains.containsString;
import static userInterfaces.ElementsPage.TEXT_VALIDATE;

public class PruebaSqa1StepDefinition {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} Necesita navegar a la pagina {string}")
    public void necesitaNavegarALaPagina(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @Given("Desea seleccionar la opcion de {string},{string} y {string}")
    public void deseaSeleccionarLaOpcionDeY(String elements, String webTables, String add) {
        theActorInTheSpotlight().attemptsTo(Navegate.option(elements,webTables,add));
    }

    @When("Crea un usuario con los datos")
    public void creaUnUsuarioConLosDatos(io.cucumber.datatable.DataTable dataTable)  {
        theActorInTheSpotlight().attemptsTo(CreateUser.withData(dataTable));
    }

    @When("Elimina un usuario por el apellido {string}")
    public void eliminaUnUsuarioPorElApellido(String lastName) {
        theActorInTheSpotlight().attemptsTo(DeleteUser.withLastName(lastName));
    }

    @Then("Valida que el texto {string} exista")
    public void validaQueElUsuarioNoExista(String text) {
        theActorInTheSpotlight().should(seeThat(ValidationTextOf.en(text, TEXT_VALIDATE), containsString(text)));
    }
}
