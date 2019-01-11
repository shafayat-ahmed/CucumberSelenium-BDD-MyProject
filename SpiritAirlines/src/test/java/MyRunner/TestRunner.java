package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\ahmed\\Desktop\\BDD-Cucumber1\\SpiritAirlines\\src\\test\\java\\Features"},
        glue = {"StepDefinitions"},
        format = {"pretty", "json:report/cucumber.json","html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        //tags = {"@FunctionalTest"},
        dryRun = false
)

public class TestRunner {
}
