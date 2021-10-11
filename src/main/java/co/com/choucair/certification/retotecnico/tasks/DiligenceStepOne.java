package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestFomrStepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DiligenceStepOne implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;

    public DiligenceStepOne(String firstName, String lastName, String email, String month, String day, String year, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
    }

    public static DiligenceStepOne thePersonalInfo(String firstName, String lastName, String email, String month, String day, String year, String languages) {
        return Tasks.instrumented(DiligenceStepOne.class, firstName, lastName, email, month, day, year, languages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(UtestFomrStepOne.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UtestFomrStepOne.INPUT_LAST_NAME),
                Enter.theValue(email).into(UtestFomrStepOne.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(UtestFomrStepOne.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(UtestFomrStepOne.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(UtestFomrStepOne.SELECT_YEAR),
                Enter.theValue(languages).into(UtestFomrStepOne.INPUT_LANGUAGES),
                Click.on(UtestFomrStepOne.BUTTON_NEXT_LOCATION));
    }
}
