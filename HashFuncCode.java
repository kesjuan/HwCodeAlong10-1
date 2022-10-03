package fcom;

import java.util.HashMap;
import java.util.Map;

public class HashFuncCode {
    public static void main(String[] args) {
        Map<String,Character> map = new HashMap<>();
        map.put("Jamila", '>');
        System.out.println(map.get("Jamila").hashCode());
        //Hash code will always be the same
    }
}
