package org.DenWorker.Java_Core._1_Basic_Syntax._1_6_Strings;

public class Task_1_6_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
    }

    public static boolean isPalindrome(String text) {
        return (new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()).reverse().toString())
                .equals(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
    }

}
