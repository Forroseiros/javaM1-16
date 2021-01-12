package lesson26;

public class HomeWork26 {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));//1
        System.out.println(countCode("codexxcode"));//2
        System.out.println(countCode("cozexxcope"));//2

        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b"));// →true
        System.out.println(bobThere("bac"));// →false
    }

    public static boolean bobThere(String input) {
        return input.contains("bob")||input.charAt(0)=='b'&&input.charAt(2)=='b';

    }


    public static int countCode(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'c' &&
                    word.charAt(i + 1) == 'o' &&
                    word.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
