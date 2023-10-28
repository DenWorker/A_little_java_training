package org.DenWorker.Java_Core._5_Generics_Collections._5_2_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_5_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> resultDeque = new ArrayDeque<>();
        while (scanner.hasNext()) {
            scanner.nextInt();
            if (scanner.hasNext()) {
                resultDeque.addFirst(scanner.nextInt());
            }
        }
        resultDeque.forEach(t -> System.out.print(t + " "));
    }
}
