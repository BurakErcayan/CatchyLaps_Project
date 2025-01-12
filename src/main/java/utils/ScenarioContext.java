package utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static ThreadLocal<Map<String, String>> threadLocalData = ThreadLocal.withInitial(HashMap::new);

    public void set(String key, String value) {
        threadLocalData.get().put(key, value);
    }

    public String get(String key) {
        return threadLocalData.get().get(key);
    }

    public boolean containsKey(String key) {
        return threadLocalData.get().containsKey(key);
    }
}
