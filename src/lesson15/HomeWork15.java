package lesson15;

public class HomeWork15 {
    public static void main(String[] args) {
        System.out.println(printLineNtimes(3, "Hello"));
        countDown(5);

        System.out.println(digitPowTwo(5));// ->25
        System.out.println(digitPowTwo(10));// ->100
        System.out.println(digitPowTwo(4));// ->16
        rectangle(5, 7);
        chess(8);
    }

    public static void chess(int line) {
        int count = 0;
        while (count < line) {
            count++;
            int sound = 0;
            while (sound < line / 2) {
                sound++;
                System.out.print(("*-"));
            }
            System.out.println();
        }

    }


    public static void rectangle(int a, int b) {
        int count = 0;
        while (count < a) {
            count++;
            int sound = 0;
            while (sound < b) {
                sound++;
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static int digitPowTwo(int number) {
        int result = 0;
        int count = 0;
        while (count < number) {
            result = result + number;
            count++;
        }
        return result;
    }

    public static String printLineNtimes(int number, String word) {

        String result = " ";
        int count = 0;
        while (count < number) {
            result = result + word + " ";
            count++;
        }
        return result;
    }

    public static void countDown(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(number-- + " ");


        }
        System.out.println("Start");
    }
}

