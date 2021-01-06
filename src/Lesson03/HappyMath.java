package Lesson03;

public class HappyMath {
    public static void main(String[] args) {
        findCirleSquare();

    }

    public static void findCirleSquare() {
        int radius = 10;
        final double PI = 3.14;
        double javaPi = Math.PI;
        // final int MAX_TEMP = 16;
        double squareCirle = PI * radius * radius;
        System.out.println("squareCirle " + squareCirle);
        System.out.println("Pi from bibliothek Java " + javaPi);


    }
}