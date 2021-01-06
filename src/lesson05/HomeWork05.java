package lesson05;

public class HomeWork05 {
    public static void main(String[] args) {
        boolean permissionCap1, permissionCap2 = true;
        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(true, false));
        System.out.println(bigBadaBoom(false, false));
        split();

        boolean doorbell1 = true;
        boolean doorbell2 = false;
        System.out.println(doorbell(true, true));
        System.out.println(doorbell(false, false));
        System.out.println(doorbell(false, true));
        split();

        boolean internet = true;
        boolean electricity = true;
        System.out.println(smartDoorCheckKey(true, false));
        System.out.println(smartDoorCheckKey(true, true));
        System.out.println(smartDoorCheckKey(false, true));
        System.out.println(smartDoorCheckKey(false, false));
        split();

        System.out.println(smartDoorCheckKey2(true, false));
        System.out.println(smartDoorCheckKey2(true, true));
        System.out.println(smartDoorCheckKey2(false, false));
        System.out.println(smartDoorCheckKey2(false, true));
        split();

    }

    public static boolean bigBadaBoom(boolean cap1, boolean cap2) {
        return cap1 && cap2;
    }

    public static void split() {
        System.out.println("-----------------------");
    }

    public static boolean doorbell(boolean door1, boolean door2) {
        return door1 ^ door2;

    }

    public static boolean smartDoorCheckKey(boolean internet, boolean electricity) {
        return internet && electricity; //  дверь открывается без ключа при наличии интернета и питания
    }

    public static boolean smartDoorCheckKey2(boolean internet, boolean electricity) {
        return internet || electricity; // дверь открывается при наличии интерента или питания
    }

}
