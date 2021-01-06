package lesson20;

public class Rubli {
    public static void main(String[] args) {
      findend(1,5);

    }

    public static void findend(int a, int b) {
        for (int i = a; i < b; i++) {
            if (a >= 5 && b < 20) {
                System.out.println(i + "Рублей");
            } else if (i % 10 == 1) {
                System.out.println(i + "Рубль");
            } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) {
                System.out.println(i + "Рубля");
            } else {
                System.out.println(i + "Рублей");
            }
        }

    }
}
