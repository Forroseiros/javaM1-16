package lesson12;

public class MyString2 {
    public static void main(String[] args) {
exeTwo();
exs03();
    }
    public static void exeTwo (){
        String hm = "Schwarzneger";
        int index = 4;
        System.out.println(hm.codePointAt(4));
        String euroSymbol = "$";
        System.out.println(euroSymbol.codePointAt(0));
        char euroSym = 8364;
        System.out.println(euroSym);
    }
    public static void exs03(){
        String hm = "Schwarzneger";
        String newHm = hm.replace('e','Я');
        System.out.println(newHm);
    }
}

