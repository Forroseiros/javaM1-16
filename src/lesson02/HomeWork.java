package lesson02;

public class HomeWork {
    public static void main(String[] args) {
        //Дан куб со стороной 10;
        // Найдите площадь и пеиметр";
        // int = 10
        findPerimetr();
        findSquare();
    }

    public static void findPerimetr() {
        int a = 10;
        int perimetr = 12 * a;
        System.out.println("Периметр куба равен:" + perimetr);
    }

    public static void findSquare() {
        int a = 10;
        int quadratSquare = a * a;
        int cubeSqure = 6 * quadratSquare;
        System.out.println("Площадь куба равна: " + cubeSqure);

    }

}
