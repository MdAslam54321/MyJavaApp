package com.java.MyJavaApp;

import com.java.MyJavaApp.util.Constant;
import com.java.MyJavaApp.util.Utils;

public class Main {
    public static void main(String[] args) {
        String sentence = Constant.JACKIE_CHAN;
        // Printing original sentence
        System.out.println(sentence);
        String reversedWords = Utils.reverseEachWord(sentence);
        System.out.println(reversedWords);
    }
}