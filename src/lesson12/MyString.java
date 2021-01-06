package lesson12;

public class MyString {
    public static void main(String[] args) {
        exampleOne();
    }

    public static void exampleOne() {
        //charAt
        String hm = "Schwarzneger";

        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length() - 3));
        char firstLetter = hm.charAt(0);
        char lastLetter = hm.charAt(hm.length() - 1);
        System.out.println("" + firstLetter + lastLetter);
        int magicInt = firstLetter + lastLetter;

        String magicString = "" + firstLetter + lastLetter;
        String magicString2 = String.valueOf(firstLetter + lastLetter);
        String magicString3 = "";
        magicString3 +=firstLetter+lastLetter;
        System.out.println(magicString);
        System.out.println(magicString2);
        System.out.println(magicString3);

    }
}
