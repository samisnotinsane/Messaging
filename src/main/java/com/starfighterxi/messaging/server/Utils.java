package com.starfighterxi.messaging.server;

import java.util.Random;

/**
 * Created by sameen on 16/10/2016.
 */
public class Utils {

    public static int generateRandomId() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }

    public static void print(String message) {
        System.out.println("[DEBUG] - " + message);
    }

}
