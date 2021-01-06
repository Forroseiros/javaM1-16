package exercisesString_13;

//Упражнения 13-16
public class Exc04 {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));// →"lololo"
        System.out.println(extraEnd("ab"));// →"ababab"
        System.out.println(extraEnd("Hi"));// →"HiHiHi"

        System.out.println(withoutEnd("Hello"));// →"ell"
        System.out.println(withoutEnd("java"));// →"av"
        System.out.println(withoutEnd("coding"));// →"odin"

        System.out.println(left2("Hello"));// →"lloHe"
        System.out.println(left2("java"));// →"vaja"
        System.out.println(left2("Hi"));// →"Hi"

        System.out.println(withoutEnd2("Hello"));// →"ell"
        System.out.println(withoutEnd2("abc"));// →"b"
        System.out.println(withoutEnd2("ab"));// →""
    }

    public static String extraEnd(String word) {
        int length = word.length();
        if (word.length() > 2) {
            return word.substring(length - 2) + word.substring(length - 2) + word.substring(length - 2);
        } else {
            return word + word + word;
        }
    }

    public static String withoutEnd(String a) {
        int size = a.length();
        return a.substring(1, size - 1);
    }

    public static String left2(String input) {
        if (input.length() <= 2) {
            return input;
        } else {
            return input.substring(2) + input.substring(0, 2);
        }
    }
    public static String withoutEnd2(String word1){
        int d = word1.length();
        return word1.substring(1,d-1);
    }
}
