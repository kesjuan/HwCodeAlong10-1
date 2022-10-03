package fcom;

import java.util.Set;
import java.util.TreeSet;

public class SetsClass {
    public static void main(String[] args) {
        Set<String> balls = new TreeSet<>();
        balls.add("blue ball");
        balls.add("yellow ball");
        balls.add("red ball");
        balls.add("red ball");
        balls.forEach(System.out::println);
        balls.remove("red ball");
        balls.forEach(System.out::println);

    }
}
