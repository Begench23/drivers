package start;

import driver.Driver;
import org.openqa.selenium.*;
import java.util.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.GooglePage;

public class Google {

    public static void main(String[] args) {


        Driver.getDriver().get("https://www.google.com");


        GooglePage googlePage = new GooglePage();

        Actions action = new Actions(Driver.getDriver());

    //    action.moveToElement(googlePage.button1).perform();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


//          Evde Denemeyin!! Danger (Jun/27-26/2022) SanAntonio/LA
//        Boolean until = wait.until(ExpectedConditions.textToBePresentInElement
//                (googlePage.button1, "I'm Feeling Hungry"));
//
//        if (until){
//
//            googlePage.button1.click();
//        }


//      Evde Denemeyin2 -- Open NewTab
//       action.keyDown(Keys.COMMAND).perform();
//       googlePage.storeButton.click();

       // not gonna work
       //  Driver.getDriver().get("https://www.google.com");


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        js.executeScript("alert('Welcome To Selenium Testing');");

    // accept/ dismiss work same if one condition
        Driver.getDriver().switchTo().alert().dismiss();



        String str = "user.dir";
        String file= "path";


        googlePage.storeButton.sendKeys(str+file);



      //  Collections.

        List<Integer> list = new Stack<>();

        Stack<Integer> a= (Stack<Integer>) list;






    }







}
