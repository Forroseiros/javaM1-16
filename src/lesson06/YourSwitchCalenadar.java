package lesson06;

public class YourSwitchCalenadar {
    public static void main(String[] args) {
        String month = "Январь";
        System.out.println(stringToIntMonthNumber(month));

    }

    public static int stringToIntMonthNumber(String month) {
        month= month.toLowerCase();
        int monthNumber = 0;
        switch (month) {
            case "январь":
                monthNumber = 1;
                break;
            case "февраль":
                monthNumber = 2;
                break;
            case "март":
                monthNumber = 3;
                break;
            case "апрель":
                monthNumber = 4;
                break;
            case "май":
                monthNumber = 5;
                break;
            case "июнь":
                monthNumber = 6;
                break;
            case "июль":
                monthNumber = 7;
                break;

            case "август":
                monthNumber = 8;
                break;

            case "сентябрь":
                monthNumber = 9;
                break;

            case "октябрь":
                monthNumber = 10;
                break;

            case "ноябрь":
                monthNumber = 11;
                break;

            case "декабрь":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;

        }

        return monthNumber;

    }
}

