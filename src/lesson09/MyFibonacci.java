package lesson09;

public class MyFibonacci {
    public static void main(String[] args) {
        lineFibonacci(11);
    }

    public static void lineFibonacci(int number) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < number - 2; i++) {
            int next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }

    }

}

