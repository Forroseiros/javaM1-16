package lesson09;

public class exc03 {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
    public static String firstHalf(String input){
        int half = input.length()/2;
        return input.substring(0,half);

    }
}
