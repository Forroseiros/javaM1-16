package lesson15;

public class LoopForExc {
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;

        }

        return result;
    }

    public static int mulyiply2(int a, int b) {
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }
        return result;
    }

    public static int multiply3(int a, int b) {
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;
        } while (count < b);
        return result;
    }

    public static void draw(int number) {

    }

}
