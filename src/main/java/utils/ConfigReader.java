package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public String propertiesFile(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/adminui/config.properties");
        prop.load(ip);
        return prop.getProperty(key);
    }
}
