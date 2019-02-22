package co.com.devco.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static co.com.devco.screenplay.endpoints.Planets.PLANETS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAPlanet implements Task {

    private final int planetID;

    SearchAPlanet(int planetID) {
        this.planetID = planetID;
    }

    @Step("{0} fetches the user with id #planetID")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(PLANETS).with(request -> request.pathParam("id", planetID))
        );
    }

    public static Performable by(int planetID) {
        return instrumented(SearchAPlanet.class, planetID);
    }
}
