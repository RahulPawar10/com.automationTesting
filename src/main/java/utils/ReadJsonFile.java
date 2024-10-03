package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFile {
    public JSONObject readNestedJsonFile(String dataFileName) throws IOException {
        String dataFilePath = System.getProperty("user.dir") + "/src/main/resources/" + dataFileName;
        JSONObject testObject = null;
        try (FileReader reader = new FileReader(dataFilePath)) {
            JSONParser jsonParser = new JSONParser();
            testObject = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return testObject;
    }


}
