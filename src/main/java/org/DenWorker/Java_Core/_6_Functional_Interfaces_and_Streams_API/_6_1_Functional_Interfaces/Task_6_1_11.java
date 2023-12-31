package org.DenWorker.Java_Core._6_Functional_Interfaces_and_Streams_API._6_1_Functional_Interfaces;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task_6_1_11 {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply("Den"));
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (t) -> (condition.test(t)) ? (ifTrue.apply(t)) : (ifFalse.apply(t));
    }

}
