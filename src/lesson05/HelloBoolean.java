package lesson05;

import sun.security.krb5.internal.crypto.HmacMd5ArcFourCksumType;

public class HelloBoolean {
    public static void main(String[] args) {
        //boolean a = true;//
        // boolean b = false;//
        //boolean c = a && b;//
        //System.out.println(c);//
        //System.out.println(a||b);//
        //System.out.println(!a);//
        // boolean d = !a;//
        //boolean f = a^b;//
        // System.out.println(f);//

        //magicGame();
        System.out.println(verySmartDepositBoxVersionThree(true, true, true));
       boolean permissionMama = true;
       boolean permissionPapa = false;
       boolean permissionGrandma = false;
        System.out.println();



    }

    public static void magicGame() {
        int a = 5;
        int b = 10;
        boolean c = a > b;
        System.out.println(c);
        System.out.println(a <= b);

    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean grandma) {
        return (mama & papa || grandma);




    }
}
