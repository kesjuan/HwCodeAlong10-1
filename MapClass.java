package fcom;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Alex");
        map.put(2,"Alexa");
        map.put(3,"marium");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) ->{
            System.out.println(key + " - " + person);
        });
        System.out.println(map.getOrDefault(3,"mairum"));


    }
}
