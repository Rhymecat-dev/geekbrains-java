package level_one;

public class LessonTwo {

    public static void main(String[] args) {
        replaceArrayElements(new int[]{0, 1, 1, 0, 1, 0, 0});
        fillArray(new int[8], new int[]{0, 3, 6, 9, 12, 15, 18, 21});
        multiplyArrayElements(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        fillMultidimensionalArray(new int[3][3]);
        findMinAndMaxElements(new int[]{10, -1, 4, 7, 8});
        verifyElementsSum(new int[]{3, 2, 1, 5, 1 });
    }

    public static int[] replaceArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] fillArray(int[] filledArray, int[] arr) {
        for (int i = 0; i < filledArray.length; i++) {
            for (int j : arr) {
                filledArray[i] = j;
                i++;
            }
        }
        return filledArray;
    }

    public static int[] multiplyArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    private static int[][] fillMultidimensionalArray(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (i == j || i + j == ints.length - 1) {
                    ints[i][j] = 1;
                }
            }
        }
        return ints;
    }

    private static void findMinAndMaxElements(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.println("Min element is " + min);
        System.out.println("Max element is " + max);
    }

    private static boolean verifyElementsSum(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= i; j--) {
                leftSum = leftSum + arr[i];
                rightSum = rightSum + arr[j];
                if (leftSum == rightSum) {
                    return true;
                }
            }
        }
        return false;
    }
}