package lesson16;

public class HW16 {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        multiply(3);
    }

    public static String doubleChar(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }

    public static void multiply(int num1) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num1 + "x" + i + "=" + i * num1);

        }

    }
}

