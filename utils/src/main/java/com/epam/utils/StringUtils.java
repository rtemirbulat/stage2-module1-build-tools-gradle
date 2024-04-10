package com.epam.utils;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) > 0 && org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
