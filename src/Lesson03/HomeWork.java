package Lesson03;

public class HomeWork {
    public static void main(String[] args) {
       double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise4AnotherTime(358.548 , 689.587));

    }
    public static double exercise4AnotherTime (double firstArea, double secondArea){
        double areaRelation = firstArea/secondArea;
        return areaRelation;
    }

    public static double exercise04() {
        //Найти соотношение площади Беларуси к площади украины
        //  B 207.595 km2
        // U 603.628 km2
        double belarusArea = 207.595;
        double ukraineSquare = 603.628;
        double relation = belarusArea / ukraineSquare;
        System.out.println("Соотношение площадей двух стран " + relation + " км ");
        return relation;

    }
}
