package stepDefs;

import driver.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Two {
    @Given("gogo")
    public void gogo() {

        Driver.getDriver().get("https://www.apple.com");

        String title = Driver.getDriver().getTitle();

        Assert.assertEquals("Apple", title);

    }
}
