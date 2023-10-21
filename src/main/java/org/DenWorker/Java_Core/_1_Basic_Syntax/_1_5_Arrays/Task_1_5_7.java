package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_7 {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 4};
        System.out.println(Arrays.toString(mergeAndSort(firstArray, secondArray)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int iteratorResArray = 0;
        for (int iterator : firstArray) {
            resultArray[iteratorResArray++] = iterator;
        }
        for (int iterator : secondArray) {
            resultArray[iteratorResArray++] = iterator;
        }

        boolean swapped;
        for (int i1 = 0; i1 < resultArray.length - 1; i1++) {
            swapped = false;
            for (int i2 = 0; i2 < resultArray.length - i1 - 1; i2++) {
                if (resultArray[i2] > resultArray[i2 + 1]) {
                    int temp = resultArray[i2];
                    resultArray[i2] = resultArray[i2 + 1];
                    resultArray[i2 + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return resultArray;
    }
}
