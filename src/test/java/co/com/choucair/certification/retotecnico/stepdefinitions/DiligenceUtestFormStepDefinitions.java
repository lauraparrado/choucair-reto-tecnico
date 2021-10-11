package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.UtestData;
import co.com.choucair.certification.retotecnico.tasks.Diligence;
import co.com.choucair.certification.retotecnico.tasks.JoinToday;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class DiligenceUtestFormStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that laura wants to start the registration in Utest$")
    public void thatLauraWantsToStartTheRegistrationInUtest() {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage() );
    }


    @When("^she completes the data required to fill out the form$")
    public void sheCompletesTheDataRequiredToFillOutTheForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligence.formUtest(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrMonth(),
                utestData.get(0).getStrDay(), utestData.get(0).getStrYear(),utestData.get(0).getStrLanguages(),
                utestData.get(0).getStrCity(),utestData.get(0).getStrPostal(), utestData.get(0).getStrPais(),
                utestData.get(0).getStrComputer(), utestData.get(0).getStrVersion(), utestData.get(0).getStrLanguage(),
                utestData.get(0).getStrMobile(), utestData.get(0).getStrModel(), utestData.get(0).getStrSystem(),
                utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPass()));
    }

    @Then("^she filled out the registration form$")
    public void sheFilledOutTheRegistrationForm() {
    }
}
