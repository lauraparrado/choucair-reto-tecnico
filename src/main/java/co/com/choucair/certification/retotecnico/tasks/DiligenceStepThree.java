package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestFormStepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class DiligenceStepThree implements Task {
    private String computer;
    private String version;
    private String language;

    public DiligenceStepThree(String computer, String version, String language) {
        this.computer = computer;
        this.version = version;
        this.language = language;
    }

    public static DiligenceStepThree theDevicesInfo(String computer, String version, String language) {
        return Tasks.instrumented(DiligenceStepThree.class,  computer, version, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFormStepThree.SPAN_COMPUTER),
                Enter.theValue(computer).into(UtestFormStepThree.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestFormStepThree.INPUT_COMPUTER),
                Click.on(UtestFormStepThree.SPAN_VERSION),
                Enter.theValue(version).into(UtestFormStepThree.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(UtestFormStepThree.INPUT_VERSION),
                Click.on(UtestFormStepThree.SPAN_LANGUAGE),
                Enter.theValue(language).into(UtestFormStepThree.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(UtestFormStepThree.INPUT_LANGUAGE),
                Click.on(UtestFormStepThree.BUTTON_LAST_STEP));
    }
}
