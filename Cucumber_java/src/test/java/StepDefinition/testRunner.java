package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinition"},monochrome=true,
//plugin= {"pretty","html:target/HtmlReports/index.html"})
//plugin= {"pretty","json:target/jSONReports/report.json"})
plugin= {"pretty","junit:target/jUnitReports/report.xml"})
public class testRunner {

}
