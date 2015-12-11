package com.kodgemisi.webapps.inventory.helpers;


public class UserValidator {

    private static String[] notAllowedUsers = {"Admin", "User", "Anonymous"};

    public static boolean isUserAllowed(String userName) {
        for (int i = 0; i < notAllowedUsers.length; i++) {
            if (userName.equals(notAllowedUsers[i]))
                return false;
        }
        return true;
    }
}
