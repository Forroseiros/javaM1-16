package lesson22;

import lesson20.PrintDoubleArray;

public class HomeWork22 {
    public static void main(String[] args) {
        double[] array = generateIntArray();
       //PrintDoubleArray.printArrayForEach(array);
        double[]array1 = new double[]{12.0, 1.0, 6.0, 4.0, 2.0, 11.0, 15.0, 1.0, 14.0, 5.0};
        double y = 20.0;
        int index = array.length / 2;
       PrintDoubleArray.printArrayForEach(insertnewelement(array1,y,index));
    }
    public static double[] insertnewelement(double[] input, double element, int index){

            double[] output = new double[input.length + 1];
            output[index] = element;
            for (int i = 0; i < index; i++) {
                output[i] = input[i];
            }
            for (int i = index; i < input.length; i++) {
                output[i + 1] = input[i];
            }
            return output;
    }

    public static double[] generateIntArray() {
        int randomLength = randomGenerate(10);
      //  System.out.println(randomLength);
        double[] output = new double[randomLength];
     //   PrintDoubleArray.printArrayForEach(output);
        for (double i = 0.0; i < output.length; i++) {
            output[(int) i] = (int) (Math.random() * 20);
        }
        return output;
    }

    public static int randomGenerate(int size) {
        int myValue = (int) (Math.random() * size);
        if (myValue < 15) {
            myValue = 10;
        }
        return myValue;
    }


}
