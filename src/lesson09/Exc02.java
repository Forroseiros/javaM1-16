package lesson09;

public class Exc02 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
    public static String makeOutWord(String out, String word){
        String result = out.substring(0,2)+ word + out.substring(2);
        return result;

    }
}
