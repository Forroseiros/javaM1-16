package lesson06;

public class Switch2 {
    public static void main(String[] args) {
        String uncle = "Дядя Саша";
        int floor = 8;
        elevator(floor);
        System.out.println(elevator(floor));
    }


    public static String elevator(int level) {
        String result = "";
        switch (level) {
            case 9:
                result = "Девятый этаж";
                break;
            case 8:
                result = "Восьмой этаж";
                break;
            case 7:
                result = "Седьмой этаж";
                break;
            case 6:
                result = "Шестой этаж";
                break;
            case 5:
                result = "Пятый этаж";
                break;
            case 4:
                result = "Четвертый этаж";
                break;
            case 3:
                result = "Третий этаж";
                break;
            case 2:
                result = "Второй этаж";
                break;
            case 1:
                result = "Первый этаж";
                break;
            case 0:
                result = "Нулевой этаж";
                break;
            case -1:
                result = "Минус первый";
            default:
                result = "Такого этажа не существует";
                break;
        }

return "Добрый день вы приехали на " + result;
    }
}
