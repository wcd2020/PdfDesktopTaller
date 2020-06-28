package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.models.DatosCalcular;
import co.com.choucair.winappdriver.flightgui.questions.AnswerResult;
import co.com.choucair.winappdriver.flightgui.tasks.RegistrarDatos;
import co.com.choucair.winappdriver.flightgui.utils.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FlightGuiStepDefinitions {

    @Given("^That (.*) wants to enter the calculator desktop application$")
    public void thatWillianWantsToEnterTheCalculatorDesktopApplication(String Willian) {
    theActorCalled(Willian).can(BrowseTheWeb.with(DriverManager.abrirCalculadoraWindows()));
    }

    @When("^he enters the data to calculator the operation$")
    public void heEntersTheDataToBuyTheTicket(List<DatosCalcular> datoscalcular) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatos.onThecalculator(datoscalcular));
    }

    @Then("^He verifies the result by comparing number (.*) with the response of the operation$")
    public void heVerifiesTheResultByComparingNumberWithTheResponseOfTheOperation(String result) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerResult.toThe(result)));

    }

}
