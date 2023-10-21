package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_6 {
    public static void main(String[] args) {
        int[] numbers0 = {1, 2, 3, 4, 5};
        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {1, 2, 3};
        int[] numbers3 = {1, 2};
        System.out.println(Arrays.toString(inverseArray(numbers0)));
        System.out.println(Arrays.toString(inverseArray(numbers1)));
        System.out.println(Arrays.toString(inverseArray(numbers2)));
        System.out.println(Arrays.toString(inverseArray(numbers3)));
    }

    public static int[] inverseArray(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[length - 1 - i];
            numbers[length - 1 - i] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
