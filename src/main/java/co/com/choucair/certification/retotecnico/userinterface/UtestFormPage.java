package co.com.choucair.certification.retotecnico.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormPage extends PageObject {
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
    public static final Target INPUT_CITY = Target.the( "enter city")
            .located(By.id("city"));
    public static final Target SPAN_SELECTED_CITY = Target.the( "enter city")
            .located(By.xpath("/html/body/div[2]/div/span[2]/span"));
    public static final Target INPUT_POSTAL = Target.the( "enter postal")
            .located(By.id("zip"));
    public static final Target SPAN_PAIS = Target.the( "select box pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_PAIS = Target.the( "enter pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SPAN_SELECTED_PAIS = Target.the( "enter pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the( "button that goes to the next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target SPAN_COMPUTER = Target.the( "select computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER = Target.the( "select computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SPAN_VERSION = Target.the( "select version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION = Target.the( "select version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SPAN_LANGUAGE = Target.the( "select language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAGE = Target.the( "select language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECT_INPUT_MOBILE = Target.the( "select mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target SELECT_INPUT_MODEL = Target.the( "select mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target SELECT_INPUT_SYSTEM = Target.the( "select mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target BUTTON_LAST_STEP = Target.the( "button that goes to the last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));


}
