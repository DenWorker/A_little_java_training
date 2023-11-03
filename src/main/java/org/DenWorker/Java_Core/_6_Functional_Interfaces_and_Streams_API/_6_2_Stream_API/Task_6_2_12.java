package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_2_Stream_API;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_6_2_12 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(123, 54325, 456, 567, 768, 7689, 78, 35, 132);
        Comparator<? super Integer> comparator = Integer::compare;
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);
        new Task_6_2_12().findMinMax(stream, comparator, biConsumer);

    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        stream.collect(Collectors.teeing(
                Collectors.minBy(order),
                Collectors.maxBy(order),
                (a, b) -> {
                    minMaxConsumer.accept(a.orElse(null), b.orElse(null));
                    return null;
                }
        ));
    }

}
