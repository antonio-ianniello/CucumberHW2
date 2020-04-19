package diadiaHW2CucumberTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//plugin xml -->{"junit:target/junit-xml-report.xml"}
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:testHw2/HW2.feature",glue="diadiaHW2CucumberTest",plugin= {"junit:target/html-response.txt"})
public class RunTester {

}