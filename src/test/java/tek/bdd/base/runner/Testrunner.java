package tek.bdd.base.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature/SetupTest.feature",
        glue = "tek.bdd.base"
)
public class Testrunner {
}
