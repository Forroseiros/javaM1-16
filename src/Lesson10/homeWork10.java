package Lesson10;

public class homeWork10 {
    public static void main(String[] args) {
        findevenNumber(100);
        findoddNumber(100);
    }

    public static void findevenNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void findoddNumber(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
    }
}


