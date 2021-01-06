package Lesson03;

public class HomeWork03 {
    public static void main(String[] args) {
        double square = findSquareRound(10);
        System.out.println("square of round: " + square);
        double C = findLangOfRound(15);
        System.out.println("Lang of Round: " + C);


        double exchero = sumofeuro(200);
        System.out.println("Quantiti of Euro: " + exchero);

        credit();
        credit2();

        cyties();
    }


    public static double findSquareRound(double r) {
        double PI = Math.PI;
        double square = PI * r * r;
        return square;


    }

    public static double findLangOfRound(double r) {
        double PI = Math.PI;
        double C = 2 * PI * r;
        return C;

    }


    public static double sumofeuro(double quantitiDollar) {

        double excheuro = quantitiDollar * 1.1;
        return excheuro;


    }


    public static void credit() {
        int sum = 1000;
        double procent = 0.035;
        int oneYear = (int) (sum * procent);
        int sevenYears = oneYear * 7;
        System.out.println("Сумма кредита через 7 лет: " + sevenYears);

    }

    public static void credit2() {
        double sum = 1000.00;
        double percent = 1.035;
        double sumpercentonryear = sum * percent; //1035
        double percentin7yars = Math.pow(percent,7); //
        double sumforhands = sum*percentin7yars;
        System.out.println("Сумма кредита через 7 лет вариант 2: " + sumforhands);

    }
    public static void cyties(){
        long количествожителейМосква = 12678079;
        double плотностьнаселенияМосква = 4949.47;
        long количествожителейБерлин = 3644826;
        long плотностьнаселенияБерлин = 4088;
        double площадьМосквы = количествожителейМосква/плотностьнаселенияМосква;
        long площадьБерлин = количествожителейБерлин/плотностьнаселенияБерлин;
        double восколькоразплощадьбольше = площадьМосквы/площадьБерлин;
        System.out.println(восколькоразплощадьбольше);
    }


}




