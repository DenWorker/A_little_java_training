package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_2_Stream_API;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Task_6_2_13 {
    public static void main(String[] args) {
        new Scanner(System.in, "UTF-8").useDelimiter("(?U)[^\\p{L}\\d]+")
                .tokens()
                .collect(Collectors.toMap(String::toLowerCase, value -> 1, Integer::sum, TreeMap::new))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(t -> System.out.println(t.getKey()));
    }

}
