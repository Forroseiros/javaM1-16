package lesson15;

public class Exc04_file_6 {
    public static void main(String[] args) {
        multiplyTable(10);
    }

    private static void multiplyTable(int lines) {
        // 1. Таблица
        // 2. содержимое, произвидение
        // 3. Отформатировать
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
