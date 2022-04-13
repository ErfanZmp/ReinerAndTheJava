package config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {

    private static final JSONParser parser = new JSONParser();
    private static JSONObject Armored;
    static {
        try {
            JSONObject a = (JSONObject) parser.parse(new FileReader("src/main/java/config/config.json"));
            Armored = (JSONObject) ((JSONObject) a.get("titansConfig")).get("ArmoredTitan");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    public static Double getHp(String organ) {
        try {
            Object found = ((JSONObject) Armored.get(organ)).get("hp");
            if(found.getClass().getSimpleName().equals("Long"))
                return ((Long) (found)).doubleValue();
            return (Double) found;
        } catch (Exception e) {
            return 0.0;
        }
    }
    public static Double getArmorDurability(String organ) {
        try {
            Object found = ((JSONObject) ((JSONObject) Armored.get(organ)).get("armor")).get("durability");
            if(found.getClass().getSimpleName().equals("Long"))
                return ((Long) found).doubleValue();
            return (Double) found;
        } catch (Exception e) {
            return 0.0;
        }
    }
    public static Double getArmorK(String organ) {
        try {
            Object found = ((JSONObject) ((JSONObject) Armored.get(organ)).get("armor")).get("k");
            if(found.getClass().getSimpleName().equals("Long"))
                return ((Long) found).doubleValue();
            return (Double) found;
        } catch (Exception e) {
            return 0.0;
        }
    }
}
