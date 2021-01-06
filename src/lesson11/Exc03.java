package lesson11;
//упражнение 13
public class Exc03 {
    public static void main(String[] args) {


        System.out.println("задача дает результат = " + (in1To10(5, false))); // →true
        System.out.println(in1To10(11, false));// →false
        System.out.println(in1To10(11, true));// →true
    }

    private static boolean in1To10(int n, boolean outsideModel) {
        return (n <= 1 || n >= 10) && outsideModel || n >= 1 && n <= 10 &&!outsideModel;

    }
}
