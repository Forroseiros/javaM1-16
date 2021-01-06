public class Ariphmetika {

    public static void main(String[] args) {
        introOne();
    }

    private static void introOne() {
        int a = 5;
        a = a+1;
        a++;
        a+=1;//все действия равносильны a = a+1
        System.out.println(a);

        int b =4;
        a*=b; //a = a*b
        System.out.println(a);

        a%=b; // a = a%b  32%4 == 0
        System.out.println(a);
    }
}




