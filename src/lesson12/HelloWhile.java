package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
       // в то время как(пока) - while
        int a = 10;
        int b = 50;
        evenAB(a,b);
        //evenAB(7,56);
        helloDoWile(10,50);
    }

    private static void helloDoWile(int x, int y) {

      do{
          System.out.println(x);
          x++;
      }while (x<y);
    }

    public static void evenAB(int a, int b){
        while (a<b){
            if (a%2 ==0){
                System.out.println(a);
            }
            a++;
        }
    }

}
