package lesson20;

public class PrintDoubleArray {

        public static void main (String[]args){
            double[] array = new double[]{1, 2, 3, 4, 5, 6, 28};
            printArrayForEach(array);
        }

        public static void printArrayForEach ( double[] array){
            for (double elementik : array) {
                System.out.print(elementik + ", ");
            }
            System.out.println();
        }
    }
