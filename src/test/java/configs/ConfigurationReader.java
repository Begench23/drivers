package configs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties properties = new Properties();

    static {

        try {
            // content root is a must
            FileInputStream fileIn = new FileInputStream("propertiesFolder/config.properties");

            properties.load(fileIn);

            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String getProperty(String key){

        return properties.getProperty(key);

    }



}
