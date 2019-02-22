package co.com.devco.screenplay.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
                 features = "classpath:features",
                 glue = {"co.com.devco.screenplay.stepdefinitions"},
                 snippets = CAMELCASE)
public class PlanetsSearchTest {
}
