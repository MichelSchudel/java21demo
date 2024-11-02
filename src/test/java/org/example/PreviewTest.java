package org.example;

import org.junit.jupiter.api.Test;

import static java.lang.StringTemplate.STR;

public class PreviewTest {

    @Test
    void stringTemplate() {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);
    }


}
