package lesson15;

public class Exc03_fail_6 {
    public static void main(String[] args) {
        chess(8);
    }

    public static void chess(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line / 2; j++) {

                System.out.print(("*-"));
            }
            System.out.println();
        }
    }

    public static String formatChess(int i, int j) {
        String result = " ";
        if (i % 2 == 0) {
            result = "-*";
        } else {
            result = "*-";
        }
        return result;
    }

}
