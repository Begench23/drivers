package stepDefs;

import driver.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class One {


    @Given("go")
    public void go() {

        Driver.getDriver().get("https://www.google.com");

        String title = Driver.getDriver().getTitle();

        //System.out.println(title);

        Assert.assertEquals("Google", title);


    }
}
