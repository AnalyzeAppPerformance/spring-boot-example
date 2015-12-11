package com.kodgemisi.webapps.inventory.helpers;


import java.util.Arrays;

public class ItemValidator {

    public static String[] notRemoveableItems = {"Computer"};

    public static boolean isItemRemoveable(String itemName) {
        if (Arrays.asList(notRemoveableItems).contains(itemName))
            return false;
        else
            return true;
    }
}
