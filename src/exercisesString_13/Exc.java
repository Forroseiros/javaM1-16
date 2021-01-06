package exercisesString_13;
//Задачи с 1 по 6 лист 13
public class Exc {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));// →"<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// →"<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// →"[[word]]"

        System.out.println(firstHalf("WooHoo"));// →"Woo"
        System.out.println(firstHalf("HelloThere"));// →"Hello"
        System.out.println(firstHalf("abcdef"));// →"abc"

        System.out.println(nonStart("Hello", "There"));// →"ellohere"
        System.out.println(nonStart("java", "code"));// →"avaode"
        System.out.println(nonStart("shotl", "java"));// →"hotlava"

        System.out.println(theEnd("Hello", true));// →"H"
        System.out.println(theEnd("Hello", false));// →"o"
        System.out.println(theEnd("oh", true));// →"o"

        System.out.println(endsLy("oddly"));// →true
        System.out.println(endsLy("y"));// →false
        System.out.println(endsLy("oddy"));// →false

    }

    public static String makeOutWord(String first, String second) {
        String result = first.substring(0, 2).concat(second).concat(first.substring(2));
        return result;
    }

    public static String firstHalf(String word) {
        int size = word.length() / 2;
        return word.substring(0, size);
    }

    public static String nonStart(String w1, String w2) {
        return w1.substring(1) + w2.substring(1);
    }

    public static String theEnd(String word, boolean b) {
        if (b == true) {
            return word.substring(0, 1);
        } else {
            return word.substring(word.length() - 1);
        }

    }
    public static boolean endsLy(String input){
        if(input.endsWith("ly")){
            return true;
        } else {
            return false;
        }
    }
}
