package Lesson10;

public class BooleanExc03 {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));// →true
        System.out.println(lastDigit(23, 19, 12));// →false
        System.out.println(lastDigit(23, 19, 3));// →true
        // упраж 8
    }

    private static boolean lastDigit(int a, int b, int c) {
        return (a%10 ==b%10 ||b%10==c%10 ||c%10==a%10);
    }

}
