package ExercicesRepeat;

import javax.crypto.Mac;

public class Ex1 {
    public static void main(String[] args) {
        //The number 6 is a truly great number.
        // Given two int values, a and b, return true if either one is 6.
        // Or if their sum or difference is 6.
        // Note: the function Math.abs(num) computes the absolute value of a number.

        System.out.println(love6(6, 4));// →true
        System.out.println(love6(4, 5));// →false
        System.out.println(love6(1, 5));// →true
    }

    private static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (Math.abs(a + b) == 6) {
            return true;
        } else {
            return false;
        }
    }
}
