package org.superautomachines.ui;

public class Util {
    public static void wait(double seconds) {
        long milliseconds = (long) (seconds * 1000);

        long startTime = System.currentTimeMillis();
        long endTime = startTime + milliseconds;

        while (System.currentTimeMillis() < endTime) { }
    }

    public static void print(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            wait(0.05);
        }
    }
}