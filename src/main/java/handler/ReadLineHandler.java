package handler;

import java.util.HashMap;
import java.util.Map;

public class ReadLineHandler {

    private static ReadLineHandler instance = new ReadLineHandler();

    private ReadLineHandler() {
        romanMap = new HashMap<>();
        materialMap = new HashMap<>();
    }

    public static ReadLineHandler getInstance() {
        return instance;
    }

    private Map<String, Object> romanMap;
    private Map<String, Object> materialMap;


    public Map<String, Object> getRomanMap() {
        return romanMap;
    }

    public Map<String, Object> getMaterialMap() {
        return materialMap;
    }

}
