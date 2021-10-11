package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.UtestData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenceStepOne.thePersonalInfo(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrMonth(),
                utestData.get(0).getStrDay(), utestData.get(0).getStrYear(),utestData.get(0).getStrLanguages()));
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenceStepTwo.theLocationInfo(utestData.get(0).getStrCity(),
                utestData.get(0).getStrPostal(), utestData.get(0).getStrPais()));
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenceStepThree.theDevicesInfo(utestData.get(0).getStrComputer(),
                utestData.get(0).getStrVersion(), utestData.get(0).getStrLanguage()));
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenceLastStep.formUtest(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPass()));
    }

    @Then("^she filled out the registration form$")
    public void sheFilledOutTheRegistrationForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrButtonComplete())));
    }
}
