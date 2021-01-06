package lesson11;
//упр 14
public class Exc04 {
    public static void main(String[] args) {
        System.out.println(old35(3));// →true
        System.out.println(old35(10));// →true
        System.out.println(old35(15));// →false
    }

    public static boolean old35(int number) {
        return number % 3 == 0 ^ number % 5 == 0;

    }
}
