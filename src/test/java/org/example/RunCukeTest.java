package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "src/test/Resource/HomePage.feature",tags = {"@MultipleSearch"})
//@CucumberOptions(features = "src/test/Resource/ResultPage.feature")
//@CucumberOptions(features = "src/test/Resource",tags = {"@smoke"})
@CucumberOptions(features = "src/test/Resource/Christmaspage.feature",
plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber-json-report.json",
        "junit:target/cucumber-xml-report.xml",
        "pretty:target/cucumber-pretty-report.txt"}
)



public class RunCukeTest {


}
