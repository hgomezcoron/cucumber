package cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// runner class
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class testRunner {

}
