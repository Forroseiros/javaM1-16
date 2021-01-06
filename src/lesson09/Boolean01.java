package lesson09;

public class Boolean01 {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
        System.out.println(cigarParty(70, false));
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        if (cigars < 40) {
            return false;
        } else if (cigars < 60 && !weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }


    }
}

