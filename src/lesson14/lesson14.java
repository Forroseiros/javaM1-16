package lesson14;

public class lesson14 {
    public static void main(String[] args) {
        //456;
        //4+5+6 = 15
        //через строку
        System.out.println(myMagicSumUno(456));
    }

    private static int myMagicSumUno(int number) {
        String input = String.valueOf(number);
        int size = input.length();
        int result = 0;
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(input.substring(0,1));
            result = result+temp;
            input=input.substring(1);

        }

        return result;
    }

}
