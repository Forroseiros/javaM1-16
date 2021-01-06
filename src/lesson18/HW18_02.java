package lesson18;

public class HW18_02 {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));// → "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront("away"));// → "aay"
        System.out.println(deFront("lbay"));// → "bay"
        System.out.println(deFront("abuse"));// → ""


        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));// → "Hi"
        System.out.println(withoutX2("xx"));// → "Hi"
    }

    private static String withoutX2(String word) {
        if(word.charAt(0)=='x'){
return word.substring(1);
        }else if (word.charAt(1)=='x'){
          return word.charAt(0)+word.substring(2);
        }else {
            return word;
        }

    }

    private static String deFront(String away) {


        if (away.charAt(0) == 'a') {
            return away.charAt(0)+away.substring(2);
        }else if (away.charAt(1)=='b'){
            return away.substring(1);
        }else {
            return away.substring(2);
        }
    }


}


