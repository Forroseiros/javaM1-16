package Lesson03;

public class myRandom {
    public static void main(String[] args) {
        int min = 30;
        int max = 100;
        int result = (int) (Math.random() * (max - min) + 1);
        System.out.println(result);
        System.out.println((int) (Math.random() * (max - min) + 1) + min);
    }
}
