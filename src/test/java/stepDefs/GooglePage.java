package stepDefs;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "gbqfbb")
    public WebElement button1;


    @FindBy(xpath = "//a[.='Store']")
    public WebElement storeButton;





}
