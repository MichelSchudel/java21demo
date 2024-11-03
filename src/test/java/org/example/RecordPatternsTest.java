package org.example;


import org.junit.jupiter.api.Test;

import java.util.*;

public class RecordPatternsTest {

    //live template prefix: rp

    record Point(Integer x, Integer y) {}

    record SpecialPoint(Point p, boolean b) {}

    @Test
    void demonstrate_record_patterns() {

        //java 17
        Object o = new Point(1,1);
        if (o instanceof Point point) {
            System.out.println("Point : " +  point.x + ", " + point.y);
        }

        //java 21
        if (o instanceof Point(Integer x, Integer y)) {
            System.out.println("Point : " +  x + ", " + y);
        }

        Object os = new SpecialPoint(new Point(1,1), true);
        //java 21
        if (os instanceof SpecialPoint(Point( Integer x, Integer y), boolean b)) {
            System.out.println("Point : " + x + ", " + y + ", special: " + b);
        }

    }
}
