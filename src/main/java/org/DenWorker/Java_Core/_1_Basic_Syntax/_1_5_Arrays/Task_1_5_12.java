package org.DenWorker.Java_Core._1_Basic_Syntax._1_5_Arrays;

public class Task_1_5_12 {
    public static void main(String[] args) {
        int[] numbers1 = {3, 5, 20, 8, 7, 3, 100};
        int[] numbers2 = {2, 4, 6, 8, 10, 12, 14};
        int[] numbers3 = {25, 87, 101};
        printOddNumbers(numbers1);
        printOddNumbers(numbers2);
        printOddNumbers(numbers3);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int iterator : arr) {
            if (Math.abs(iterator % 2) == 1) {
                oddNumbers.append(iterator).append(",");
            }
        }
        if (!oddNumbers.isEmpty()) {
            System.out.println(oddNumbers.deleteCharAt(oddNumbers.length() - 1));
        }
    }
}
