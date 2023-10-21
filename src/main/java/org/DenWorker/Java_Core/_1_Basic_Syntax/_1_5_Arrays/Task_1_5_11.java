package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_11 {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 4};
        System.out.println(Arrays.toString(mergeAndSort(firstArray, secondArray)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        Arrays.sort(resultArray);
        return resultArray;
    }

}
