package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Validationresult extends PageObject {

    public static final Target RESULT_FINAL = Target.the("Extrae el resultado de la operacion")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));
}