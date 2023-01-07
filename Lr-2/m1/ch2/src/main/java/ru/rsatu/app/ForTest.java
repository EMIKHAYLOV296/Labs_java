package ru.rsatu.app;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class ForTest {

    public static JSONObject stringToJson(String arg) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(arg);
            return json;
        } catch (Exception e) {
            return null;
        }
    }

    public static String jsonToString(JSONObject arg) {
        return arg.toString();
    }
}
