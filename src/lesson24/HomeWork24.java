package lesson24;

import lesson20.Main;

public class HomeWork24 {
    public static void main(String[] args) {
        int[] plus1 = new int[]{1, 2};//
        int[] plus2 = new int[]{3, 4};//
        int[] plus3 = new int[]{4, 4};//
        int[] plus4 = new int[]{2, 2};//
        int[] plus5 = new int[]{9, 2};//
        int[] plus6 = new int[]{3, 4};//
        Main.printArrayForEach(plusTwo(plus1, plus2));
        Main.printArrayForEach(plusTwo(plus3, plus4));
        Main.printArrayForEach(plusTwo(plus5, plus6));
        plusTwo(plus1, plus2);// → [1, 2, 3, 4]
        plusTwo(plus3, plus4);// → [4, 4, 2, 2]
        plusTwo(plus5, plus6);// → [9, 2, 3, 4]
        System.out.println("______________________");
        int[] max1 = new int[]{1, 2, 3};//3
        int[] max2 = new int[]{1, 5, 3};//5
        int[] max3 = new int[]{8, 5, 3};//8
        int[] max4 = new int[]{5, 2, 3};//3

        System.out.println(maxTriple(max1));
        System.out.println(maxTriple(max2));
        System.out.println(maxTriple(max3));
        System.out.println(maxTriple(max4));
        System.out.println("_______________________");

        int[] make1 = new int[]{4, 5};
        int[] make2 = new int[]{1, 2, 3};
        int[] make3 = new int[]{4};
        int[] make4 = new int[]{1, 2, 3};
        int[] make5 = new int[]{ };
        int[] make6 = new int[]{1, 2};
        Main.printArrayForEach(make2(make1,make2));
        Main.printArrayForEach(make2(make3,make4));
        Main.printArrayForEach(make2(make5,make6));

        make2(make1, make2);// → [4, 5]
        make2(make3, make4);// → [4,1]
        make2(make5, make6);// → [1, 2]

    }

    public static int[] make2(int[] array3, int[] array4) {
        int[] result = new int [2];
        if (array3.length > 1) {
            result[0] = array3[0];
            result[1] = array3[1];
        } if (array3.length==1){
            result[0]=array3[0];
            result[1]=array4[0];
        } if (array3.length==0){
            result[0]=array4[0];
            result[1]=array4[1];
        }
        return result;
    }

    private static int maxTriple(int[] arr) {
        if (arr[0] > arr[1] && arr[0] > arr[2]) {
            return arr[0];
        }
        if (arr[1] > arr[0] && arr[1] > 2) {
            return arr[1];
        }
        if (arr[2] > arr[1] && arr[2] > arr[0]) {
            return arr[2];
        }
        return 0;
    }

    private static int[] plusTwo(int[] array1, int[] array2) {
        int[] output = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            output[i] = array1[i];
        }
        for (int i = array1.length; i < output.length; i++) {
            output[i] = array2[i - array1.length];
        }
        return output;
    }
}
