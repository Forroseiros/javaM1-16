package lesson02;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        findPerimetrOfQuadrate();
        findSquareOfQuadrate();
        findPerimetrOfQuadrate2();
        findSquareOfQuadrate3();
        findSquareOfTriangle();
        findPerimetrOfTrianlge();
        perimetrOfTrianglebyte();
        grainsOnTheChessboard();

    }

    public static void findPerimetrOfQuadrate() {
        int a = 8;
        int b = 8;
        int c = 8;
        int d = 8;
        int perimetr = a + b + c + d;
        System.out.println("P quadrate = " + perimetr);
    }

    public static void findSquareOfQuadrate() {
        int a = 8;
        int b = 8;
        int square = a * b;

        System.out.println("S quadrate = " + square);

    }

    public static void findPerimetrOfQuadrate2() {
        byte a = 8;
        byte b = 8;
        byte c = 2;
        byte sum = (byte) (a + b);
        System.out.println("P quadrate = " + sum * 2);

    }

    public static void findSquareOfQuadrate3() {
        long a = 8;
        long b = 8;
        long multiply = a * b;
        System.out.println("S quadrate = " + multiply);
    }

    public static void findSquareOfTriangle() {
        int a = 5;
        int h = 20;
        int square = a * h / 2;
        System.out.println("S triangle = " + square);
    }

    public static void findPerimetrOfTrianlge() {
        int a = 5;
        int b = 5;
        int c = 5;
        int sum = a + b + c;
        int perimetr = sum;
        System.out.println("P triangle = " + sum);
    }

    public static void perimetrOfTrianglebyte() {
        byte a = 5;
        byte b = 5;
        byte c = 5;
        byte perimetr = (byte) (a + b + c);
        System.out.println("P triangle = " + perimetr);
    }

    public static void grainsOnTheChessboard() {
        long a1 = 2;
        long b1 = 63;
        long d = (long) Math.pow(a1, b1);
        System.out.println("Итого количество зерен =  " + d);


    }


}

