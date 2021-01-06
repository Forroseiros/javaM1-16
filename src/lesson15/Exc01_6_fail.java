package lesson15;

public class Exc01_6_fail {
    public static void main(String[] args) {

        rectangle(5,7);
    }
    public static void rectangle(int a,int b){
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < b ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
