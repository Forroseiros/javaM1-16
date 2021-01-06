package lesson07;

public class HelliZina {
    public static void main(String[] args) {
        System.out.println(salesPermission(10));

    }
    public static String salesPermission(int age){
        String result = "";
        if (age>=18){
           result  = "Продавать можно";
        }else {
            result = "Продавать нельзя";
        }


        return result;

    }
}
