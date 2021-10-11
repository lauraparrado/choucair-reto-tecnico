package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepTwo extends PageObject {
    public static final Target INPUT_CITY = Target.the( "enter city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the( "enter postal")
            .located(By.id("zip"));
    public static final Target SPAN_COUNTRY = Target.the( "select box pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the( "enter pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the( "button that goes to the next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
