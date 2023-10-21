package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

import java.util.Arrays;

public class Task_1_5_5 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 2, 17};
        int[] numbers2 = {14, 16, 3};
        int[] numbers3 = {};

        System.out.println(Arrays.toString(getArrayMiddle(numbers1)));
        System.out.println(Arrays.toString(getArrayMiddle(numbers2)));
        System.out.println(Arrays.toString(getArrayMiddle(numbers3)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int length = numbers.length;

        if (length == 0) {
            return new int[0];
        }

        int[] resultArrayMiddle = new int[length % 2 == 0 ? 2 : 1];
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            resultArrayMiddle[0] = numbers[middleIndex - 1];
            resultArrayMiddle[1] = numbers[middleIndex];
        } else {
            resultArrayMiddle[0] = numbers[middleIndex];
        }
        return resultArrayMiddle;
    }
}
