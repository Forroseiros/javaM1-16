package lesson05;

public class Training {
    public static void main(String[] args) {
        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission= true;
        papaPermission = false;
        omaPermission = false;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));

    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean oma){
        return (mama&&papa)||oma;
    }
}
