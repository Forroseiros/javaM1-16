package lesson07;

public class HomeWork07 {
    public static void main(String[] args) {
        int km = 40;
        System.out.println(checkspeed(150));
    }

    public static String checkspeed(int speed) {
        String result = " ";
        if (speed < 50) {
            result = "Нарушений нет";
        } else if (speed <= 65) {
            result = "Устное порицание и лекция на 5 минут";
        } else if (speed < 100) {
            result = "Штраф 40 евро ";
        } else if (speed <= 130) {
            result = "Штраф 500 евро ";
        } else {
            result = "Штраф 1000 евро и конфискация прав на 3 года и конфискация транспортного средства";
        }
        return result;
    }
}
