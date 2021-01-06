package lesson05;

public class HomeWork05_03 {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));// →0
        System.out.println(caughtSpeeding(65, false));// →1
        System.out.println(caughtSpeeding(65, true));// →0
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 81) {
            return 1;
        } else {
            return 2;
        }
    }
}
