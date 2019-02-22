package co.com.devco.screenplay.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ThePlanet {

    public static Question<String> name() {
        return actor -> lastResponse().body().path("name");
    }
}
