package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestFormPage;
import com.google.inject.Key;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;

public class Diligence implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;
    private String city;
    private String postal;
    private String pais;
    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String system;
    private String password;
    private String confirmPass;

    public Diligence(String firstName, String lastName, String email, String month, String day, String year, String languages, String city,String postal, String pais,  String computer, String version, String language, String mobile, String model, String system, String password, String confirmPass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
        this.city = city;
        this.postal = postal;
        this.pais = pais;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.system = system;
        this.password = password;
        this.confirmPass = confirmPass;
    }

    public static Diligence formUtest(String firstName, String lastName, String email, String month, String day, String year, String languages, String city, String postal,String pais, String computer, String version, String language, String mobile, String model, String system, String password, String confirmPass) {
        return Tasks.instrumented(Diligence.class, firstName, lastName, email, month, day, year, languages, city, postal,
                pais, computer, version, language, mobile, model, system, password, confirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(UtestFormPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UtestFormPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(UtestFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(UtestFormPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(UtestFormPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(UtestFormPage.SELECT_YEAR),
                Enter.theValue(languages).into(UtestFormPage.INPUT_LANGUAGES),
                Click.on(UtestFormPage.BUTTON_NEXT_LOCATION),

                Click.on(UtestFormPage.SPAN_PAIS),
                Enter.theValue(pais).into(UtestFormPage.INPUT_PAIS),
                Hit.the(Keys.ENTER).into(UtestFormPage.INPUT_PAIS),
                //WaitUntil.the(UtestFormPage.SPAN_SELECTED_PAIS, containsText(pais)).forNoMoreThan(30).seconds(),
                Enter.theValue(city).into(UtestFormPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormPage.INPUT_CITY),
                WaitUntil.the(UtestFormPage.INPUT_CITY, hasValue(city)).forNoMoreThan(30).seconds(),
                Enter.theValue(postal).into(UtestFormPage.INPUT_POSTAL),
                Click.on(UtestFormPage.BUTTON_NEXT_DEVICES)






//                Enter.theValue(strCiudad).into(LlenarRegistro2.CIUDAD),
//                Hit.the(Keys.ARROW_DOWN).into(LlenarRegistro2.CIUDAD),
//                Click.on(LlenarRegistro2.BOTON_PAIS),
//                Enter.theValue(strPais).into(LlenarRegistro2.PAIS),
//                Hit.the(Keys.ENTER).into(LlenarRegistro2.PAIS),
//                Enter.theValue(strCoPostal).into(LlenarRegistro2.CODIGO_POSTAL),
//                Click.on(LlenarRegistro2.BOTON_NEXT2)


        );


    }
}
