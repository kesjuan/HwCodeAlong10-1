package fcom;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        List<String> colorsUnmodifiable = List.of(
//                "blue",
//                "yellow"
//        );

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        for(String color: colors){
            System.out.println(color);
        }
        colors.forEach(System.out::println);

        for (int x = 0; x < colors.size(); x++) {
            System.out.println(colors.get(x));

        }



    }

}
