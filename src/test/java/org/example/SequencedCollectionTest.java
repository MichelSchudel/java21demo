package org.example;


import org.junit.jupiter.api.Test;

import java.util.*;

public class SequencedCollectionTest {

    @Test
    void test() {

        //getting first element
        List<String> list = List.of("s", "t");
        list.get(0);

        //java 21
        list.getFirst();

        //Dequeue uses getFirst()
        ArrayDeque q = new ArrayDeque<String>();
        q.getFirst();

        //java 21
        q.getFirst();

        //Set uses first
        var s = new TreeSet<String>();
        s.add("d");
        s.first();

        //java 21
        s.getFirst();

        //linked hash set
        var ls = new LinkedHashSet<String>();
        ls.iterator().next();

        //java 21
        ls.getFirst();

        //linked hash map
        var sm = new LinkedHashMap<String,String>();
        sm.entrySet().iterator().next();

        //java 21
        sm.firstEntry();



    }
}
