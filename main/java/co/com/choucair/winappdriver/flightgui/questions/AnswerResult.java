package co.com.choucair.winappdriver.flightgui.questions;

import co.com.choucair.winappdriver.flightgui.userinterfaces.Validationresult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerResult implements Question<Boolean> {

    private String result;



    private AnswerResult(String result) {

        this.result = result;
    }

    public static AnswerResult toThe(String result) {
        return new AnswerResult(result);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultcomparated;
        String operationresult = Text.of(Validationresult.RESULT_FINAL).viewedBy(actor).asString();
        if (result.equals(operationresult)){
            resultcomparated = true;
        }
        else
        {
            resultcomparated = false;
        }
        return resultcomparated;
    }
}

