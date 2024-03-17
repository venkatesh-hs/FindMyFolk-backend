package com.findmyfolk.utility;

public class FolkUtilities {
    public static String emptyStringCheck(String attribute) {
        return attribute.isBlank() ? null : attribute;
    }
}
