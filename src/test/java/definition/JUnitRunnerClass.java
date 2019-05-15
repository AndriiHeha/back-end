package definition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src.test.cucumberDef",
        tags = "@AhehaTag"
)**/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src.test.cucumberDef",
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm", "pretty", "json:target/cucumber-report/report.json"}
)

public class JUnitRunnerClass {
}
