import java.util.*;

public class Tester {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(345, "Pralhad");
        map.put(346, "Joel");
        map.put(347, "Komal");
        
        System.out.println("map: " + map);
        
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(345, "Pralhad");
        map1.put(346, "Joel");
        map1.put(347, "Komal");
        
        System.out.println("map: " + map);
        
    }
}
