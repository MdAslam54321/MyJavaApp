package com.java.MyJavaApp;

import com.java.MyJavaApp.util.Test;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        String sentence = "Jackie Chan is the best hollywood actor";
        // Printing original sentence
        System.out.println(sentence);
        String reversedWords = t.reverseEachWord(sentence);
        System.out.println(reversedWords);
    }
}