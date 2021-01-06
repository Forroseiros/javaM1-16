package lesson09;

public class exc05 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));

//решить дома!!!!!!
    }

    private static String theEnd(String word, boolean b) {
        // если б = тру, то тогда верни первую букву, иначе верни последнюю
        String output = "";
        if (b) { // b == true
            //return word.substring(0, 1);
            output = word.substring(0, 1);
        } else {
            // return word.substring(word.length() - 1);
            output = word.substring(word.length() - 1);
        }
        return output;
    }
}
