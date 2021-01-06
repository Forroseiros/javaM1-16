package lesson06;

public class HomeWork06 {
    public static void main(String[] args) {
        int age10 = 10;
        int age17 = 17;
        int age18 = 18;
        int age20 = 20;
        int age30 = 30;
        System.out.println(youcandrinkalc(10));
        System.out.println(youcandrinkalc(17));
        System.out.println(youcandrinkalc(18));
        System.out.println(youcandrinkalc(20));
        System.out.println(youcandrinkalc(30));
        System.out.println(youcandrinkalc(85));
        split();

        int january = 1;
        int february = 2;
        int march = 3;
        int april = 4;
        int may = 5;
        int june = 6;
        int july = 7;
        int august = 8;
        int september = 9;
        int oktober = 10;
        int november = 11;
        int december = 12;
        System.out.println(seasonsOfYear(5));
        System.out.println(seasonsOfYear(10));
        System.out.println(seasonsOfYear(1));
        System.out.println(seasonsOfYear(8));
    }

    public static String youcandrinkalc(int age) {
        String youcandrink = " ";
        switch (age) {
            case 10:
                youcandrink = "You are too small to drink alc.";
                break;
            case 17:
                youcandrink = "You can not drink, wait a little";
                break;
            case 18:
                youcandrink = "You can drink, congratulations";
                break;
            case 20:
                youcandrink = "You can drink";
                break;
            case 30:
                youcandrink = "It's to late to drink alc. drink mineral water";
                break;
            default:
                youcandrink = "Your age is unknown, show your passport";
        }

        return youcandrink;
    }

    public static void split() {
        System.out.println("---------------------------------------------");
    }

    public static String seasonsOfYear(int month) {
        String monthsOfYear;
        switch (month) {
            case 1:
            case 2:
                monthsOfYear = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                monthsOfYear = "Spring";
                break;
            case 6:
                monthsOfYear = "Summer";
                break;
            case 7:
                monthsOfYear = "Summer";
                break;
            case 8:
                monthsOfYear = "Summer";
                break;
            case 9:
                monthsOfYear = "Autumn";
                break;
            case 10:
                monthsOfYear = "Autumn";
                break;
            case 11:
                monthsOfYear = "Autumn";
                break;
            case 12:
                monthsOfYear = "Winter";
                break;
            default:
                monthsOfYear = "Doesn't exist";
        }
        return monthsOfYear;
    }
}



