package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_10 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 4, 2, 17};
        int[] numbers2 = {14, 16, 3};
        int[] numbers3 = {};
        System.out.println(Arrays.toString(getArrayMiddle(numbers1)));
        System.out.println(Arrays.toString(getArrayMiddle(numbers2)));
        System.out.println(Arrays.toString(getArrayMiddle(numbers3)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int middle = numbers.length / 2;
        return (numbers.length == 0) ? (new int[0]) : ((numbers.length % 2 == 0) ? (Arrays.copyOfRange(numbers, middle - 1, middle + 1)) : (Arrays.copyOfRange(numbers, middle, middle + 1)));
    }

}
