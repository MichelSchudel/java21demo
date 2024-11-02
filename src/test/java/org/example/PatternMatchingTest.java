package org.example;


import org.junit.jupiter.api.Test;

public class PatternMatchingTest {

    record Point(Integer x, Integer y) {
    }

    @Test
    void test() {

        var point = new Point(1, 2);
        //java 17
        oldStylePatternMatching(1);
        oldStylePatternMatching("string");
        oldStylePatternMatching(new RuntimeException());

        //java 21
        newStylePatternMatching(1);
        newStylePatternMatching("string");
        newStylePatternMatching(new RuntimeException());
        newStylePatternMatching(point);

    }

    @Test
    void test2() {

        //java 17
        newStylePatternMatching(null);

        newStylePatternMatchingNullSafe(null);


    }

    //java 17
    private static void oldStylePatternMatching(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("Object is an integer:" + i);
        } else if (obj instanceof String s) {
            System.out.println("Object is a string:" + s);
        } else if (obj instanceof Point(Integer x, Integer y)) {
            System.out.println("Object is a point:" + x + y);
        } else {
            System.out.println("Object is not recognized");
        }
    }

    //java 21
    private static void newStylePatternMatching(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Object is an integer:" + i);
            case String s -> System.out.println("Object is a string:" + s);
            case Point(Integer x, Integer y) -> System.out.println("Object is a point:" + x);
            default -> System.out.println("Object is not recognized");
        }
    }

    //java 21
    private static void newStylePatternMatchingNullSafe(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Object is an integer:" + i);
            case String s -> System.out.println("Object is a string:" + s);
            case Point(Integer x, Integer y) -> System.out.println("Object is a point:" + x);
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

}
