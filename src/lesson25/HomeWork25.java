package lesson25;

public class HomeWork25 {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100

        System.out.println("_____________________________");

        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100

        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"

        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        // Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        findB(7,20);
        findBandA(5,17);
    }

    private static void findBandA(int a, int b) {
        int number = a;
        do {
            System.out.println(number);
            number++;
        }while (number<b);
    }

    private static void findB(int a, int b) {
        int number = 0;
        do {
            System.out.print(a);
            number++;
        }while (number<20);
    }

    public static String myFirstCompareTo(String str1, String str2) {
        return (str1.compareToIgnoreCase(str2) < 0) ? str1 : str2;

    }

    public static int getMeMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int getMeMin(int a, int b) {
        return (a < b) ? a : b;
    }
}
