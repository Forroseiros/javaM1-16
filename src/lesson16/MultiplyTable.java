package lesson16;

public class MultiplyTable {
    public static void main(String[] args) {
        myTable(10);
    }

      public static void myTable(int size)  {
          for (int i =1 ; i <= size ; i++) {
              for (int j = 1; j <= size ; j++) {
                  String placeInTable = formatPlaceInTable(i,j);
                  System.out.print(placeInTable);

              }
              System.out.println();

          }
      }
      public static String formatPlaceInTable(int i, int j){
        String result = "";
        int imput = i*j;
        if (imput <10){
            result = "  " + imput;
        } else if (imput>=100){
            result = "" + imput;
        }else {
            result= " " + imput;
        }

        return result;
      }
}
