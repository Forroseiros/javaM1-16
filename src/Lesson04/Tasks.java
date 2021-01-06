package Lesson04;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); //"Hello Bob!"
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName2("Bob"));

    }

    public static String helloName(String name) {
        String result = " ";
        String hello = "Hello ";
        String lastSymol = "!";
        result = hello + name + " " + lastSymol;
        return result;

    }
    public static String helloName2(String name){
        return "Hello" + name + "!";
    }
}
