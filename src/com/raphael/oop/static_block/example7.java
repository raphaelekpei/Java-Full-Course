package com.raphael.oop.static_block;

public class example7 {

    private static Personn[] PEOPLE = null;

    static {
        PEOPLE = new Personn[10];
        // add business logic here
        for (int i = 0; i < PEOPLE.length; i++) {
            // populate the array with data
        }
    }
}
