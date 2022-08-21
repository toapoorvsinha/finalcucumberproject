package runnerspackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Type this RunWith statement and import the Junit library before doing it here
@RunWith(Cucumber.class)
//Another annotation-import using cucumber api
@CucumberOptions(
			//put location of features class here
			features = "src/test/java/featurespackage",
			//under glue, put the pkg name of where u got all ur definitions stored
			glue = "stepspackage",
			tags = "@BlueBackground, @WhiteBackground",
			monochrome=true,
			dryRun = false,
			plugin = {
					//current console results
					"pretty",
					//this is the .html link found under target\cucumber\index
					//turns red on steps where process is erroring out on web report
					"html:target/cucumber",
					"json:target/cucumber.json"
			}
			
		)
//^now run everything we just did as a junit test and copy and paste
//missing steps onto Steps package

public class BackgroundRunner {

}
