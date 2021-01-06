package exercisesString_13;

//Упражнения 17-
public class Exc05 {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));// →"Helo"
        System.out.println(nTwice("Chocolate", 3));// →"Choate"
        System.out.println(nTwice("Chocolate", 1));// →"Ce"

        System.out.println(hasBad("badxx"));// →true
        System.out.println(hasBad("xbadxx"));// →true
        System.out.println(hasBad("xxbadxx"));// →false

        System.out.println(conCat("abc", "cat"));// →"abcat"
        System.out.println(conCat("dog", "cat"));// →"dogcat"
        System.out.println(conCat("abc", ""));// →"abc"
    }

    public static String nTwice(String str1, int number) {
        if (number == 2) {
            return str1.substring(0, 2) + str1.substring(str1.length() - 2);
        } else if (number == 3) {
            return str1.substring(0, 3) + str1.substring(str1.length() - 3);
        } else if (number == 1) {
            return str1.substring(0, 1) + str1.substring(str1.length() - 1);
        } else {
            return "";
        }
    }
    public static boolean hasBad(String word) {
        if (word.substring(0, 3).equals("bad")) {
            return true;
        } else if (word.substring(1, 4).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }
    public static String conCat(String word1,String word2){
        if(word1.substring(word1.length()-1).equals(word2.substring(0))){
            return word1+word2.substring(1);
        } else {
            return word1+word2;
        }
    }
}
