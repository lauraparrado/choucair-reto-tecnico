package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestFormStepTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class DiligenceStepTwo implements Task {
    private String city;
    private String postal;
    private String country;

    public DiligenceStepTwo(String city, String postal, String country) {
        this.city = city;
        this.postal = postal;
        this.country = country;
    }

    public static DiligenceStepTwo theLocationInfo(String city, String postal, String country) {
        return Tasks.instrumented(DiligenceStepTwo.class, city, postal, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(UtestFormStepTwo.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormStepTwo.INPUT_CITY),
                Click.on(UtestFormStepTwo.SPAN_COUNTRY),
                Enter.theValue(country).into(UtestFormStepTwo.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(UtestFormStepTwo.INPUT_COUNTRY),
                Enter.theValue(postal).into(UtestFormStepTwo.INPUT_POSTAL),
                Click.on(UtestFormStepTwo.BUTTON_NEXT_DEVICES));
    }
}
