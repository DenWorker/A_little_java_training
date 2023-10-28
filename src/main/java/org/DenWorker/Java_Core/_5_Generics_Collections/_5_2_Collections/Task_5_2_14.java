package org.DenWorker.Java_Core._5_Generics_Collections._5_2_Collections;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task_5_2_14 {
    public static void main(String[] args) {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes())));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> resultMap = new HashMap<>();
        String line;
        String[] partsOfLine;
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            while ((line = bufferedReader.readLine()) != null) {
                partsOfLine = line.split(" ");
                resultMap.merge(partsOfLine[0], Long.valueOf(partsOfLine[1]), Long::sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resultMap;
    }
}
