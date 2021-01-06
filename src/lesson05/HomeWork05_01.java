package lesson05;

public class HomeWork05_01 {
    public static void main(String[] args) {
        //System.out.println(bigBadaBoom(true, true)); //-> true
        //System.out.println(bigBadaBoom(false, false)); //-> false
        //System.out.println(bigBadaBoom(true, false));  //false


        System.out.println(doorbell(true, true));// -> false
        System.out.println(doorbell(false, false));// -> false
        System.out.println(doorbell(true, false));// -> true
    }
    //public static boolean bigBadaBoom(boolean cap1,boolean cap2){
        //return cap1&&cap2;
    public static boolean doorbell(boolean door1, boolean door2){
        return door1^door2;
    }

    }

