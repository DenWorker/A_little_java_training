package org.DenWorker.Java_Core._5_Generics_Collections._5_2_Collections;

import java.util.HashSet;
import java.util.Set;

public class Task_5_2_13 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(0, 1, 2));


        System.out.println(symmetricDifference(set1, set2));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> bufSet = new HashSet<>(set2);
        Set<T> resultSet = new HashSet<>(set2);

        resultSet.addAll(set1);
        bufSet.retainAll(set1);
        resultSet.removeAll(bufSet);

        return resultSet;
    }
    
}
