package com.java.MyJavaApp.util;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {

    // Method to reverse each word of a sentence
    public static String reverseEachWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static Map<Character, Long> countCharacterFreq(String sentence) {
        return sentence.chars()
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .filter(ch -> ch != ' ')
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
    }
}
