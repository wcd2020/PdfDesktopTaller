package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Mapcalculator extends PageObject {

    public static final Target INPUT_DATO1 = Target.the("ingresar dato 1")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));
    public static final Target TIPO_OPERACION = Target.the("ingresar tipo de operación")
            .located(By.xpath("//*[@AutomationId='multiplyButton']"));
    public static final Target INPUT_DATO2 = Target.the("ingresar dato 2")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));
    public static final Target RESULTADO = Target.the("resultado de la operacion")
            .located(By.xpath("//*[@AutomationId='equalButton']"));

}
