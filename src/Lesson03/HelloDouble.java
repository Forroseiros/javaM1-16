package Lesson03;

public class HelloDouble {
    public static void main(String[] args) {
      helloFloat();
      helloInt();
      helloDouble();
    }

    public static void  helloFloat() {
        float a = (float) 3.5;
        float b = 5.7F;
        float c = 5.6f;
        float d= a+b+c;
        System.out.println("a+b+c = " +d);


    }

    public static void helloInt(){
        int a = 9;
        int b = 5;
        int c = b/a;
        System.out.println("a/b:" + c);
        float f1 = 9;
        float f2 = 5;
        float f3 = f2/f1;
        System.out.println("f2/f1: "+ f3);
    }
    public static void helloDouble(){
        double d1 = 1.0;
        double d2 = 10.0;
        double d3 = d1/d2;
        System.out.println(d3);

    }


}
