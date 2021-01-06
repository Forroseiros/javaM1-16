package Lesson10;

public class HomeWork3000 {
    public static void main(String[] args) {
findNumber();
    }

    public static void findNumber() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);

            }
        }
    }
}





