package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.ClockDisplay clock = new com.company.ClockDisplay(3, 1, 0);
        for (int i = 0; i < 100; i++) {
            clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}
