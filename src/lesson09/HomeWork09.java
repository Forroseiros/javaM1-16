package lesson09;

public class HomeWork09 {
    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
        int number = 20;

        System.out.println(digit(12));
        System.out.println(digit(17));
        System.out.println(digit(19));

        int number1 = 12;
    }

    public static boolean more20(int number) {
        return ((number - 1) % 20 == 0 || (number - 2) % 20 == 0);
    }

    public static boolean digit(int number) {
        return number % 10 > 7 || number % 10 < 3;
    }
}




