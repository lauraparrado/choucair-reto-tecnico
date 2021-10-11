package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.UtestFormLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String buttonComplete;

    public Answer(String buttonComplete) {
        this.buttonComplete = buttonComplete;
    }

    public static Answer toThe(String buttonComplete) {
        return new Answer(buttonComplete);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameButtonComplete = Text.of(UtestFormLastStep.BUTTON_COMPLETE
        ).viewedBy(actor).asString();
        if (buttonComplete.equals(nameButtonComplete)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
