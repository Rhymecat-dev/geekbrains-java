package level_two.lesson_five;

import java.util.Arrays;

public class Main {

    private static final int ARRAY_SIZE = 10000000;
    private static final int HALF_ARRAY = ARRAY_SIZE / 2;

    public static void main(String[] args) {
        float[] array = new float[ARRAY_SIZE];
        fillArray(array);
        calculateByFormulaOne(array);

        fillArray(array);
        calculateByFormulaTwo(array);
    }

    public static void fillArray(float[] array) {
        Arrays.fill(array, 1);
    }

    public static void calculateByFormulaOne(float[] array) {
        long operationStartTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long operationEndTime = System.currentTimeMillis();
        System.out.println("Calculating time is " + (operationEndTime - operationStartTime));
    }

    public static void calculateByFormulaTwo(float[] array) {
        long operationStartTime = System.currentTimeMillis();
        float[] array1 = new float[HALF_ARRAY];
        float[] array2 = new float[HALF_ARRAY];

        System.arraycopy(array, 0, array1, 0, HALF_ARRAY);
        System.arraycopy(array, HALF_ARRAY, array2, 0, HALF_ARRAY);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < array2.length; i++) {
                array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, array, 0, HALF_ARRAY);
        System.arraycopy(array2, 0, array, HALF_ARRAY, HALF_ARRAY);

        long operationEndTime = System.currentTimeMillis();
        System.out.println("Calculating time is " + (operationEndTime - operationStartTime));
    }
}
