package lesson09;

public class Booleanexc02 {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
        System.out.println(caughtSpeeding(81, false));
        System.out.println(caughtSpeeding(81, true));
    }

    public static int caughtSpeeding(int speed, boolean birthday){
        if (birthday){speed = speed-5;
        }
        
        if(speed<=60){
          return 0;
        }else if(speed<=80){
            return 1;
        }else {
            return 2;
        }
    }
}
