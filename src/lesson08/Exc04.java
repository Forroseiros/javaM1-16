package lesson08;

public class Exc04 {
    public static void main(String[] args) {
        modulo();
    }

    public static void modulo() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " Делится на 3 без остатка");
            }
        }
    }
}
