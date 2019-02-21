package co.com.devco.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class PlanetsSearchStepDefinitions {

    private Actor JENN = Actor.named("Jennifer");
    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @Before
    public void prepareStage()  {
        theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
        JENN.can(CallAnApi.at(theRestApiBaseUrl));
    }
}
