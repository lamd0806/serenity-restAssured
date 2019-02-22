package co.com.devco.screenplay.exceptions;

public class PlanetInvalidResponse extends AssertionError {

    public static String INVALID_PLANET_NAME = "The planet name was not the expected";

    PlanetInvalidResponse(String message) {
        super(message);
    }


}
