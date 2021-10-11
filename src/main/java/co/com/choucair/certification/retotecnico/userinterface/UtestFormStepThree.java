package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepThree extends PageObject {
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
    public static final Target BUTTON_LAST_STEP = Target.the( "button that goes to the last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
