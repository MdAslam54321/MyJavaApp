package com.java.MyJavaApp.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {

    // Method to reverse each word of a sentence
    public static String reverseEachWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
