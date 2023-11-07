package org.DenWorker.Java_Core._5_Generics_Collections._5_2_Collections;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5_2_14 {
    public static void main(String[] args) {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes())));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> resultMap = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            resultMap.merge(scanner.next(), scanner.nextLong(), Long::sum);
        }
        return resultMap;
    }
}
