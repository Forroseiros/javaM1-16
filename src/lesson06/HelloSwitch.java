package lesson06;

public class HelloSwitch {
   /*
   За пятерку по контрольной в Java - велосипед
   За четверку - GoPro
   За тройку - не поругают
   За двойку - отругают
   За единицу - "атата"

    */
   public static void main(String[] args) {

       int score = 1;
       int score2 = 3;
       myFirstSwitch(score);
       myFirstSwitch(score2);
       myFirstSwitch(5);
   }

   public static void myFirstSwitch(int schoolScore){
       String prize = "";
       // switch это оператор выбора , ключевое слово, конструкт
       switch (schoolScore){
           case 1:
               prize = "атата";
               break;
           case 2:
               prize = "За двойку отругаю";
               break;
           case 3:
               prize = "За тройку не поругают";
               break;
           case 4:
               prize = "За четверку GoPro";
               break;
           case 5:
               prize = "За пятерку велосипед";
               break;
           default:
               prize = "Такой оценки не существует";
               break;

       }
       System.out.println(prize);


   }


}
