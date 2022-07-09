package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefs",

        plugin = {"html:target/REPORT.html",
                "me.jvt.cucumber.report.PrettyReports:target/PRETTY",
                "rerun:target/rerun.txt"
        }


)



public class TestRunner {



}
