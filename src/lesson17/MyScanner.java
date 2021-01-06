package lesson17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println("What is your name?");
        String customerName;
        customerName = input.next();
        System.out.println("Are you sure " + customerName + "that you are " + age + " years? ");
    }

}
