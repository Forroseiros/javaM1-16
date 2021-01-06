package lesson07;

public class HW7 {
    public static void main(String[] args) {
        String left = "left";
        String right = "right";
        String goahead = "go ahead";
        System.out.println(wayOfVityaz("go ahead"));
    }

    public static String wayOfVityaz(String ways) {
        String result = "";
        if (ways.equals("right")) {
            result = "Death";
        } else if (ways.equals("left")) {
            result = "Will lose horse";
        } else if (ways.equals("go ahead")) {
            result = "Will lose your leg";
        } else {
            result = "wrong choice";
        }
        return result;
    }
}


