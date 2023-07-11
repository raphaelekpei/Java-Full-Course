package com.raphael.constants.enums;

import java.time.DayOfWeek;

public class DayOfTheWeekApplication {

    public static void main(String[] args) {
        // Accessing enum values
        System.out.println(DayOfTheWeek.MONDAY);

        // Enum Methods
        // 1. valueof()
        DayOfWeek day6 = DayOfWeek.valueOf("FRIDAY");
        System.out.println(day6);


        // Iterating over enum values
        DayOfWeek[] days = DayOfWeek.values();

        for (DayOfWeek day : days) {
            System.out.println(day);
        }
    }

}
