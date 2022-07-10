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

   // private static WebDriver driver= null;

    public static InheritableThreadLocal<WebDriver> driver= new InheritableThreadLocal<>();

    static String browser= ConfigurationReader.getProperty("browser");


    public static WebDriver getDriver(){

        if (driver.get() == null){


            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();

                    //  options.setHeadless(true);
                    // options.addArguments("--headless");
                    driver.set(new ChromeDriver(options));
                    break;

                case"firefox":

                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options1 = new FirefoxOptions();
                    options1.setHeadless(true);
                    driver.set(new FirefoxDriver(options1));
                    break;

                default:
                     throw new RuntimeException("browser fail");

            }


            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        return driver.get();

    }

    public static void closeDrive(){

        if (driver.get() != null){

            driver.get().quit();
            driver.remove();
            driver= null;

        }


    }





}
