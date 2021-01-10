package lesson23;

import lesson20.Main;

public class HW23_2 {
    public static void main(String[] args) {
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
}

