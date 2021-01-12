package lesson27;

public class HomeWork27 {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));//21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(8, 17));// → 17
        System.out.println(blackjack(23, 21));// → 21
        System.out.println(blackjack(23, 24));// → 0
        System.out.println("_______________________________");
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(1, 3, 3));// → 1
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println("_______________________________");
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
        System.out.println("_______________________________");
        //Return a version of the given string, where for every star ()
        //in the string the star and the chars immediately to its left and right
        // are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".

    }

    public static int countHi(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'h' && word.charAt(i + 1) == 'i')
                count++;
        }
        return count;
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == c) {
            return b;
        } else if (b == a) {
            return c;
        } else if (b == c) {
            return a;
        } else {
            return a + b + c;
        }
    }


    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if (b > a) {
            return b;
        }
        if (b < a) {
            return a;
        } else {
            return -1;
        }
    }
}
