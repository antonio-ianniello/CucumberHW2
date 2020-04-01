package diadiaHW2CucumberTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:testHw2/HW2.feature",glue="diadiaHW2CucumberTest",plugin= {"junit:target/junit-xml-report.xml"})
public class RunTester {

}