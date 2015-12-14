package com.kodgemisi.webapps.inventory.helpers;


import java.util.Random;

public class InventoryCodeGenerator {

    public static String generateInventoryCode(int length, String characters) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        return new String(text);

    }

    public static void main(String args[]) {
        System.out.println(InventoryCodeGenerator.generateInventoryCode(10, "ABc"));
    }
}
