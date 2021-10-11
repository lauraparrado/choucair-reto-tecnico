package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinTodayPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us form to Join today")
            .located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Join Today')] "));
}
