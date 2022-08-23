package co.com.p.links.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.Map;

import static co.com.p.links.userinterfaces.PLinksHome.BTN_ELEMENTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor

public class SelectLinks implements Task{

    private final Map<String,String> mapSelectLinks;

    public static SelectLinks inThePage(Map<String,String> mapSelectLinks){
        return instrumented(SelectLinks.class, mapSelectLinks);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS));
        actor.attemptsTo(Click.on(BTN_ELEMENTS));
    }

}
