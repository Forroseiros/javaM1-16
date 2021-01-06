package exercisesString_13;

import java.util.SplittableRandom;

public class Exc03 {
    //Упражнения 10-12
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));// →"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));// →"HHH"

        System.out.println(startWord("hippo", "hi"));// →"hi"
        System.out.println(startWord("hippo", "xip"));// →"hip"
        System.out.println(startWord("hippo", "i"));// →"h"

        System.out.println(makeAbba("Hi", "Bye"));// →"HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// →"YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// →"WhatUpUpWhat"
    }

    public static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0, 2) + word.substring(0, 2) + word.substring(0, 2);
        } else if (word.length() < 2) {
            return word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1);
        } else {
            return "";
        }
    }

    public static String startWord(String puk, String word1) {
        String temp1 = puk.substring(1);
        String temp2 = word1.substring(1);
        if (puk.startsWith(word1)) {
            return puk.substring(0, word1.length());
        } else if (temp1.startsWith(temp2)) {
            return puk.substring(0, word1.length());
        } else {
            return "";
        }
    }
    public static String makeAbba(String a, String b){
        return a+b+b+a;
    }
}
