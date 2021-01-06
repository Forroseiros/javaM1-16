package lesson02;

public class HelloInteger2 {
    public static void main(String[] args) {

        helloInt();
        helloByte();

    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f);


    }

    public static void helloInt() {
        int a = 9;
        System.out.println("waiting for: "   +  a);
        int b = 5;
        System.out.println(a + b); // 14
        System.out.println(a * b); //45
        System.out.println(a / b); // 2.8;3
        System.out.println(a - b); //4


    }
}
