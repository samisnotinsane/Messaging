package com.starfighterxi.messaging.server;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by sameen on 16/10/2016.
 */
public class Utils {

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }

    public static void print(String message) {
        System.out.println("[DEBUG] - " + message);
    }

    public static void out(String out) {
        System.out.println("[SYSTEM] - " + out);
    }

    public static String in() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
