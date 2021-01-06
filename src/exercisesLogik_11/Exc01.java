package exercisesLogik_11;

//Упражнения 1-3
public class Exc01 {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));// →false
        System.out.println(cigarParty(50, false));// →true
        System.out.println(cigarParty(70, true));// →true

        System.out.println(caughtSpeeding(60, false));// →0
        System.out.println(caughtSpeeding(65, false));// →1
        System.out.println(caughtSpeeding(65, true));// →0

        System.out.println(love6(6, 4));// →true
        System.out.println(love6(4, 5));// →false
        System.out.println(love6(1, 5));// →true
    }

    public static boolean cigarParty(int cigars, boolean b) {
        if (cigars >= 40 && !b) {
            return true;
        } else if (cigars >= 60 && b) {
            return true;
        } else {
            return false;
        }
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
    public static boolean love6(int a, int b){
        if (a==6||b==6||a-b==6||b-a==6||a+b==6){
            return true;
        }else {
            return false;
        }
    }
}
