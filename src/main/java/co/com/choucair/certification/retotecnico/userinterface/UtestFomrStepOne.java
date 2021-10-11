package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFomrStepOne extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("enter first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("enter last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("enter email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select month ")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select year")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("search and select language")
            .located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the( "button that goes to the next location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
