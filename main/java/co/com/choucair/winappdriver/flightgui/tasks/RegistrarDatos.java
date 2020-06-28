package co.com.choucair.winappdriver.flightgui.tasks;

import co.com.choucair.winappdriver.flightgui.models.DatosCalcular;
import co.com.choucair.winappdriver.flightgui.userinterfaces.Mapcalculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

public class RegistrarDatos implements Task {

    private  List<DatosCalcular> datoscalcular;
    public RegistrarDatos(List<DatosCalcular> datoscalcular) {
        this.datoscalcular = datoscalcular;
    }
    public static RegistrarDatos onThecalculator(List<DatosCalcular> datoscalcular) {
        return Tasks.instrumented(RegistrarDatos.class,datoscalcular);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datoscalcular.get(0).getDato1()).into(Mapcalculator.INPUT_DATO1),
                Click.on(Mapcalculator.TIPO_OPERACION),
                Enter.theValue(datoscalcular.get(0).getDato2()).into(Mapcalculator.INPUT_DATO2),
                Click.on(Mapcalculator.RESULTADO));
    }
}
