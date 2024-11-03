package org.example;

import org.junit.jupiter.api.Test;

/**
 * DROPPED
 */
public class PreviewTest {

    @Test
    void stringTemplate() {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);
    }


}
