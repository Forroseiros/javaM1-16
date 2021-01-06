package lesson11;
// упр 15
public class Exc05 {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));// →7
        System.out.println(teenSum(10, 13));// →19
        System.out.println(teenSum(13, 2));// →19
    }

    private static int teenSum(int a, int b) {
        int result = a + b;
        if ((a >= 13 && a <= 19) || b >= 13 && b <= 19) {
            result = 19;

        }
        return result;
    }
}




