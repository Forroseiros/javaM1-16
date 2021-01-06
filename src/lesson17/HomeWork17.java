package lesson17;

import java.util.Scanner;

public class HomeWork17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = input.next();
        String surname;
        System.out.println("What is your surname?");
        surname = input.next();
        String sex;
        System.out.println("What is your sex?");
        sex = input.next();
        int age;
        System.out.println("How old are you?");
        age = input.nextInt();
        String email;
        System.out.println("Tipe your adress e-mail");
        email = input.next();

    }

    public static void Scan() {
        Scanner input = new Scanner(System.in);
        String age;
        System.out.println("What is your age?");
        age = String.valueOf(Integer.parseInt(input.next()));

    }
}
