package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(s-> StringUtils.isNumeric(s) && Double.parseDouble(s)>0);
    }
}