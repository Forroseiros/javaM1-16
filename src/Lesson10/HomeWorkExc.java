package Lesson10;

public class HomeWorkExc {
    public static void main(String[] args) {
        System.out.println(Leapyear(2020));//true
        System.out.println(Leapyear(2021));//false
        System.out.println(Leapyear(2022));//false
        System.out.println(Leapyear(2128));//true
    }

    private static boolean Leapyear(int year) {
        return year%4==0||year%400==0;

    }
}
