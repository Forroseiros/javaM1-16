package lesson12;

public class HomeWork12 {
    //Given three ints, a b c, return true if b is greater than a,
    // and c is greater than b. However, with the exception that if "bOk" is
    //true, b does not need to be greater than a.
    public static void main(String[] args) {
        //b>a true
        //c>b true
        //if  boolean BOK true - b<=a
       /* System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        split();*/
        /*System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        split();*/
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
        split();
        System.out.println(theEnd("Hello", true));//→ "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
        split();
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"

    }

    private static String middleThree(String input) {
        int middle = input.length()/2;
        String output = input.substring(middle-1,middle+2);
        return output;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b && !bOk || c > b && bOk) {
            return true;
        } else {
            return false;
        }
    }

    public static void split() {
        System.out.println("---------------------------------------");
    }

    public static boolean lessBy10(int a, int b, int c) {
//Вернуть true если одно из заданных чисел на 10 или более больше чем любое другое
// Я НЕ ЗНАЮ РЕШЕНИЕ ЭТОЙ ЗАДАЧИ
        if (a<=b-10||a<=c-10){
            return true;
        }else if (b<=a-10||b<=c-10){
            return true;
        }else if (c<=a-10||c<=b-10){
            return true;
        }
        return false;
        }

    public static boolean endsLy(String word) {
        if (word.endsWith("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static String theEnd(String word, boolean front) {
        if (front == true) {
            return word.substring(0, 1);
        } else {
            return word.substring(word.length() - 1);
        }
    }



}



