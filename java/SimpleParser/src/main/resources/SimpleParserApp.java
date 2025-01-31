/**
 *# Simple JSON parser to extract key-value pairs
 * import json
 * json_data = '{"name": "John", "age": 31, "city": "New York"}'
 * parsed_data = json.loads(json_data)
 * print("Parsed JSON:")
 * for key, value in parsed_data.items():
 *     print(key, ":", value)
 */

import java.lang.System.*;
import org.json.JSONObject;

public class SimpleParserApp {
    public static void main(String[] args) {
        // JSON data as a string
        String jsonData = "{\"name\": \"John\", \"age\": 31, \"city\": \"New York\"}";

        // Parse JSON string into a JSONObject
        JSONObject parsedData = new JSONObject(jsonData);

        // Print parsed JSON
        out.println("Parsed JSON:");
        for (String key : parsedData.keySet()) {
            Object value = parsedData.get(key);
            out.println(key + " : " + value);
        }// end for
    }// end main
}// end SimpleParserApp class