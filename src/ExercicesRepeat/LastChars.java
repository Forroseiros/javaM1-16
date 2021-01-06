package ExercicesRepeat;

public class LastChars {
    //Given 2 strings, a and b, return a new string made of
   // the first char of a and the last char of b, so "yo" and "java" yields "ya". If
   // either string is length 0, use '@' for its missing char.
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"
    }

    private static String lastChars(String a, String b) {
        String x = a;
        String y = b;

        if(x.length()==0){
            x="@";

        } if (y.length()==0){
            y="@";
        }
        String firstLetterWord = x.substring(0,1);
        String lastLetterWord = y.substring(y.length()-1);
        return firstLetterWord+lastLetterWord;
    }
}
