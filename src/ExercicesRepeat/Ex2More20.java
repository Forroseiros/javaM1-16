package ExercicesRepeat;

public class Ex2More20 {
    public static void main(String[] args) {
        //Return true if the given non-negative number is 1 or 2 more
        //than a multiple of 20. See also: Introduction to Mod
        //заданное число больше на 1 или 2 числа, кратного 20, то возвращать true

        System.out.println(more20(20));// →false
        System.out.println(more20(21));// →true
        System.out.println(more20(22));// →true
    }

    public static boolean more20(int number) {
        if (number % 20 == 1||number%20==2) {
            return true;
        } else {
            return false;
        }
    }
}
