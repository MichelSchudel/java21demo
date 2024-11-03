package org.example;


import org.junit.jupiter.api.Test;

import java.util.*;

public class SequencedCollectionTest {

    //live template key: sc

    @Test
    void demonstrate_list() {

        var list = new ArrayList<>(List.of(
                "devoxx",
                "j-fall")
        );

        var linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("devoxx");
        linkedHashSet.add("j-fall");

        var treeSet = new TreeSet<String>();
        treeSet.add("devoxx");
        treeSet.add("j-fall");

        //get first
        print(list.get(0));
        print(linkedHashSet.iterator().next());
        print(treeSet.first());

        //get last
        print(list.get(list.size() - 1));
        print(linkedHashSet.toArray()[linkedHashSet.size()-1]);
        print(treeSet.last());

        //reverse list
        var mutableList = new ArrayList<>(list);
        Collections.reverse(mutableList);
        print(mutableList);

        var mutableHashList = new ArrayList<>(linkedHashSet);
        Collections.reverse(mutableHashList);
        LinkedHashSet<String> reversedSet = new LinkedHashSet<>(mutableHashList);
        print(reversedSet);

        print(treeSet.descendingSet());

        //add first...
        //add last...

        //java 21
        list.getFirst();
        list.getLast();
        list.addFirst("voxxed");
        list.addLast("javazone");
        list.reversed();

    }

    @Test
    void demonstrate_map() {
        var linkedHashMap = new LinkedHashMap<String,String>();
        linkedHashMap.put("conference1", "devoxx");
        linkedHashMap.put("conference2", "j-fall");

        //first entry
        print(linkedHashMap.entrySet().iterator().next());
        //last entry
        print(linkedHashMap.entrySet().toArray()[linkedHashMap.size()-1]);

        //java 21
        print(linkedHashMap.firstEntry());
        print(linkedHashMap.lastEntry());
        print(linkedHashMap.reversed());
        print(linkedHashMap.pollFirstEntry());
        print(linkedHashMap.pollLastEntry());
    }

    private void print(Object o) {
        System.out.println(o);
    }
}
