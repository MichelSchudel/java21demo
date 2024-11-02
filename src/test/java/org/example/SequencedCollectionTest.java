package org.example;


import org.junit.jupiter.api.Test;

import java.util.*;

public class SequencedCollectionTest {

    @Test
    void test() {

        //getting first element
        List<String> list = new ArrayList<>(List.of("devoxx", "j-fall"));
        //get first
        var firstElement = list.get(0);
        //get last
        var lastElement = list.get(list.size() - 1);
        //add first
        list.add(0, "voxxed");
        //add last
        list.add(list.size() - 1, "javazone");
        //reverse
        var mutableList = new ArrayList<String>(list);
        Collections.reverse(mutableList); // ugly!!!!

        //java 21
        list.getFirst();
        list.getLast();
        list.reversed();

        //linked hash set
        var linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("devoxx");
        linkedHashSet.add("j-fall");

        //first element
        var firstSetElement = linkedHashSet.iterator().next();

        //last element
        var lastSetElement = linkedHashSet.toArray()[linkedHashSet.size()-1];

        //reverse
        var mutableHashList = new ArrayList<>(linkedHashSet);
        Collections.reverse(mutableList); // ugly!!!!


        LinkedHashSet<String> reversedSet = new LinkedHashSet<>(mutableList);

        //java 21
        linkedHashSet.getFirst();
        linkedHashSet.getLast();
        linkedHashSet.reversed();

        //TreeSet
        var s = new TreeSet<String>();
        s.add("devoxx");
        s.add("j-fall");

        //first element
        var firstTreeSetElement = s.first();

        //last element
        var lastTreeSetElement = s.last();

        //reverse
        var reversedTreeSet = s.descendingSet();

        //java 21
        s.getFirst();
        s.getLast();
        s.reversed();


        //linked hash map
        var sm = new LinkedHashMap<String,String>();
        sm.entrySet().iterator().next();

        //java 21
        sm.firstEntry();
        sm.lastEntry();
        sm.reversed();




    }
}
