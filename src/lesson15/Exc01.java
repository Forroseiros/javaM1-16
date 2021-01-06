package lesson15;

// 5 файл, задача №12
public class Exc01 {
    public static void main(String[] args) {
        printLineNtimes("Hello", 3);
        System.out.println(printLineNtimesString("frontend", 2));
        countdown(5);
        System.out.println(digitPowTwo(5));
        System.out.println(digitPowTwo(10));
        System.out.println(digitPowTwo(4));
    }

    public static void printLineNtimes(String word, int number) {
      for (int i = 0; i < number; i++) {
           System.out.print(word + " ");
        }

    }

    public static String printLineNtimesString(String word, int number) {
        String result = " ";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static void countdown(int nummer) {
        for (int i = nummer; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println("start");
    }

    public static int digitPowTwo(int number){
        int result= 0;
        for (int i = 0; i < number; i++) {
            result=result+number;

        }return result;
    }
}
