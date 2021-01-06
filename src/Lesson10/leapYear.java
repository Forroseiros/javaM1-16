package Lesson10;

public class leapYear {

    public static void main(String[] args) {
        System.out.println(Leapyear(2020));//true
        System.out.println(Leapyear(2000));//true
        System.out.println(Leapyear(1800));//false
        System.out.println(Leapyear(2021));//false
    }

    private static boolean Leapyear(int year) {
        //return year % 400==0||(year %4 == 0^ year % 100);
        //return year %400 ==0||(year %4 == 0 && year % 100 !=0);
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}



