package org.DenWorker.Java_Core._3_Exceptions._3_1_Getting_to_Know_the_Exceptions;

public class Task_3_1_6 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName()); // null
        System.out.println("==========================");
        anotherMethod1(); // org.your.project.Test#main
        System.out.println("==========================");
        anotherMethod2(); // #method2
    }

    private static void anotherMethod1() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod2() {
        anotherMethod1();
    }

    public static String getCallerClassAndMethodName() {
        if (Thread.currentThread().getStackTrace().length < 4) {
            return null;
        } else {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName();
        }
    }
}
