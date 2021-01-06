package lesson08;

public class Exc05 {
    public static void main(String[] args) {
        myLine100(100);
    }

    public static void myLine100(int number) {
        for (int i = 1; i < number; i++)
            if (i % 7 == 0) {
                System.out.println(i + " ");
            }
    }

}

