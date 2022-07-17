package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import accelerators.Base;
import cucumber.api.CucumberOptions;
import utility.utils;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = {"src//test//resources//features//iLabLogin.feature"},
        glue = {"seleniumGlueCode"},
        plugin = {"json:target/cucumber.json"}
)
public class RunnerTest {

}
