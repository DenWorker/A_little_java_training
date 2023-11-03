package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_2_Stream_API;

import java.util.stream.IntStream;

public class Task_6_2_11 {
    public static void main(String[] args) {
        pseudoRandomStream(13).forEach(t -> System.out.print(t + " "));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> {
            int square = i * i;
            return (square / 1000 < 0) ? (square / 10) : (square / 10 % 1000);
        });
    }

}
