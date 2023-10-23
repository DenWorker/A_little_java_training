package org.DenWorker.Java_Core._3_Exceptions._3_1_Getting_to_Know_the_Exceptions;

public class Task_3_1_4 {
    public static void main(String[] args) {
        Integer num = 5;
        String str1;

        Object obj = num;
        String str2 = (String) obj;

        System.out.println(str2);
        System.out.println("java.lang.ClassCastException");
    }
}
