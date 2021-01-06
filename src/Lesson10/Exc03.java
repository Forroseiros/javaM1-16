package Lesson10;

public class Exc03 {
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));// →3
        System.out.println(maxMod5(6, 2));// →6
        System.out.println(maxMod5(3, 2));// →3
        //упраженение 9
    }

    private static int maxMod5(int valuel1, int valuel2) {
        int max = Math.max(valuel1, valuel2); // можно здесь указать 0 это второй метод
        int min = Math.min(valuel1, valuel2); // можно здесь указать 0 это второй метод
        if (valuel1 > valuel2) {
            min = valuel2;
            max = valuel1;
        } else {
            min = valuel1;
            max = valuel2;
        }

        min=Exc04.myMin(valuel1,valuel2); // Третий метод решения

        if (valuel1 == valuel2) {
            return 0;
        } else if (valuel1 % 5 == valuel2 % 5) {
            return min;
        } else {
            return max;
        }
    }
}
