package lesson15;

public class Exc2_faiL_6 {
    public static void main(String[] args) {
        digits();
    }

    public static void digits() {
        int result = 36;
        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z + " ");

                    }
                }
            }
        }

    }
}
