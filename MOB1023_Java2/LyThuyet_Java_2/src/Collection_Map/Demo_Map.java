package Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("Iphone X", 7);
        map.put("Iphone 11", 15);
        map.put("Iphone 12", 20);
        map.put("Iphone 13", 25);
        
        System.out.println("Map: " + map);
        
        Set<String> keys = map.keySet();
        
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
