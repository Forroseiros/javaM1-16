package lesson11;

public class Exc06 {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
    }

    public static String fizzStringUno(String str) {
        //1 отсеить те, кто начинается с f и заканчивается b
        //2 отсеить те, кто начинается с f
        // 3 отсеить те, кто начинается с b
        //4 все остальное

        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equals("b")) {
            return "Bizz";
        } else {
            return str;
        }
    }

    public static String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "Fizzbuzz";
        }   else if ((str.charAt(0) == 'f')) {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } return str;
    }
}
