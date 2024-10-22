package org.example;


import org.junit.jupiter.api.Test;

public class CaseRefinementTest {

    enum FruitType {
        APPLE,
        PEAR
        }

    @Test
    void test() {

        //java 17
        inefficientCaseRefinement(FruitType.APPLE);

        //java 21
        caseRefinement(FruitType.APPLE);
        nicerCaseRefinement(FruitType.APPLE);

    }


    //java 17
    private static void inefficientCaseRefinement(Object obj) {
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f -> {
                if (f == FruitType.APPLE) {
                    System.out.println("Object is an apple");
                }
                if (f == FruitType.PEAR) {
                    System.out.println("Object is a pear");
                }
            }
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }
    //java 21
    private static void caseRefinement(Object obj) {
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f when (f == FruitType.APPLE) -> {
                System.out.println("Object is an apple");
            }
            case FruitType f when (f == FruitType.PEAR) -> {
                System.out.println("Object is a pear");
            }
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

    //java 21
    private static void nicerCaseRefinement(Object obj) {
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType.APPLE -> {
                System.out.println("Object is an apple");
            }
            case FruitType.PEAR -> {
                System.out.println("Object is a pear");
            }
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }


}
