package co.com.choucair.certification.retotecnico.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormLastStep extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the( "button that goes to the last step")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS= Target.the( "button that goes to the last step")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("aceptar terminos y condiciones").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("aceptar terminos y condiciones").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("completando registro").
            located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
