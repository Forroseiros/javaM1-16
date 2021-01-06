package lesson08;

public class exc03Pelmen {
    public static void main(String[] args) {
        happyPelmen();

    }

    public static void happyPelmen() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Happy dumplings " + i);
            }
        }
    }
}
