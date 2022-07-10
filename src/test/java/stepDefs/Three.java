package stepDefs;

import driver.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Three {
    @Given("goAgain")
    public void goagain() {

        Driver.getDriver().get("https://www.cydeo.com");

        String title = Driver.getDriver().getTitle();

        Assert.assertEquals("Cydeo",title);


    }
}
