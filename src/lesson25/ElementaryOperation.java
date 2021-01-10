package lesson25;

public class ElementaryOperation {
    public static void main(String[] args) {
        int[] arr = myLovelyRandom(10);
        int[] arr1 = new int[0];
        int[] arr2 = new int[]{3, 5};
        myLovelyPrint(arr);
        System.out.println(minValueInArray(arr));
        System.out.println(maxValueInArray(arr));
        System.out.println("Сумма всех элементов массива - " + sumElementArray(arr));
        System.out.println("Среднее значение элементов массива - " + middleValueElementInArray(arr));
    }

    private static double middleValueElementInArray(int[] arr) {
        // 1. сложить
        // 2. разделить
        double sum = sumElementArray(arr);
        return sum / arr.length;
    }

    private static int sumElementArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static String maxValueInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return "Максимальное значение " + max;
    }

    private static String minValueInArray(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(j, min);
        }
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            // Мой код
        }
/*        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }*/
        return "минимальное значение в массиве " + min;
    }
    private static void myLovelyPrint(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] myLovelyRandom(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
