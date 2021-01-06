package lesson08;

public class HelloFor {
    public static void main(String[] args) {
       myWeek();

    }
    public static void myWeek(){
        int weekDays = 7;
        //начало
        //условие
        //шаг
        for (int i = 0; i <weekDays ; i++) {
            System.out.println("----------");
            System.out.println("Я встаю в 5 утра");
            System.out.println("Иду на работу");
            System.out.println("Прихожу с работы");
            System.out.println("Курю с соседом");
            System.out.println("Смотрю телек");
            System.out.println("Иду спать");
            System.out.println(i);
        }
    }

}
