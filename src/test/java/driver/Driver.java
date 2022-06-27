package driver;

import configs.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Driver {


    private Driver() {
        // singleton design pattern
    }

    private static WebDriver driver= null;

    static String browser= ConfigurationReader.getProperty("browser");


    public static WebDriver getDriver(){

        if (driver == null){


            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();

                    //  options.setHeadless(true);
                    // options.addArguments("--headless");
                    driver= new ChromeDriver(options);
                    break;

                case"firefox":

                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options1 = new FirefoxOptions();
                    options1.setHeadless(true);
                    driver= new FirefoxDriver(options1);
                    break;

                default:
                     throw new RuntimeException("browser fail");

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        return driver;

    }

    public static void closeDrive(){

        if (driver != null){

            driver.quit();
            driver= null;

        }


    }





}
