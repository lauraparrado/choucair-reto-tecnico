package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestFormLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class DiligenceLastStep implements Task {
    private String password;
    private String confirmPass;

    public DiligenceLastStep(String password, String confirmPass) {
        this.password = password;
        this.confirmPass = confirmPass;
    }

    public static DiligenceLastStep formUtest(String password, String confirmPass) {
        return Tasks.instrumented(DiligenceLastStep.class,  password, confirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(password).into(UtestFormLastStep.INPUT_PASSWORD),
                Enter.theValue(confirmPass).into(UtestFormLastStep.INPUT_CONFIRMPASS),
                Click.on(UtestFormLastStep.CHECK_TERMS),
                Click.on(UtestFormLastStep.CHECK_PRIVACY));
    }
}
