package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        System.out.println(Arrays.toString(getSubArrayBetween(numbers, 4, 10)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int[] bufSubArray = new int[numbers.length];
        int size = 0;
        for (int iterator : numbers) {
            if (iterator >= start && iterator <= end) {
                bufSubArray[size] = iterator;
                size++;
            }
        }

        int[] finalResultSubArray = new int[size];
        System.arraycopy(bufSubArray, 0, finalResultSubArray, 0, size);
        return finalResultSubArray;
    }


}
