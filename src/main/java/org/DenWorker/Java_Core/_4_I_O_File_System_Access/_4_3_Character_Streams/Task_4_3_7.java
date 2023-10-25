package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_3_Character_Streams;

import java.util.Scanner;

public class Task_4_3_7 {
    public static void main(String[] args) {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", result);
    }

}
