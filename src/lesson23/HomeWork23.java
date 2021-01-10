package lesson23;

import lesson20.Main;

public class HomeWork23 {
    public static void main(String[] args) {
        int[] max1 = new int[]{1, 2, 3};//[3, 3, 3]
        int[] max2 = new int[]{11, 5, 9};//[11, 11, 11]
        int[] max3 = new int[]{2, 11, 3};//[3, 3, 3]
        Main.printArrayForEach(maxEnd3(max1));
        Main.printArrayForEach(maxEnd3(max2));
        Main.printArrayForEach(maxEnd3(max3));
        maxEnd3(max1);
        maxEnd3(max2);
        maxEnd3(max3);
        System.out.println("_______________________________");

        int[] ends1 = new int[]{1, 2, 3};//→ [1, 3]
        int[] ends2 = new int[]{1, 2, 3, 4};// → [1, 4]
        int[] ends3 = new int[]{7, 4, 6, 2};//→ [7, 2]
        Main.printArrayForEach(makeEnds(ends1));
        Main.printArrayForEach(makeEnds(ends2));
        Main.printArrayForEach(makeEnds(ends3));
        makeEnds(ends1);
        makeEnds(ends2);
        makeEnds(ends3);
        System.out.println("_______________________________");

        int[] last1 = new int[]{4,5,6};//→ [0, 0, 0, 0, 0, 6]
        int[] last2 = new int[]{1,2};//→ [0, 0, 0, 2]
        int[] last3 = new int[]{3};//→ [0, 3]
        Main.printArrayForEach(makeLast(last1));
        Main.printArrayForEach(makeLast(last2));
        Main.printArrayForEach(makeLast(last3));
        makeLast(last1);
        makeLast(last2) ;
        makeLast(last3);
    }
    private static int[] makeLast(int [] input) {
        int[]output = new int[input.length*2];
        output[output.length-1]= input[input.length-1];
        return output;
    }

    public static int[] makeEnds(int[] array) {
        int[] output = new int[2];
        output[0] = array[0];
        output[output.length - 1] = array[array.length - 1];
        return output;
    }

    public static int[] maxEnd3(int[] array) {
        int[] result = new int[3];

        if (array[2] > array[0]) {
            result[0] = array[2];
            result[1] = array[2];
            result[2] = array[2];
        }
        if (array[0] > array[2]) {
            result[0] = array[0];
            result[1] = array[0];
            result[2] = array[0];
        }
        return result;
    }


}

