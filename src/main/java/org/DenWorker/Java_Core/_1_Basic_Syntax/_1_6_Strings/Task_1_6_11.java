package org.DenWorker.Java_Core._1_Basic_Syntax._1_6_Strings;

import java.util.regex.Pattern;

public class Task_1_6_11 {
    public static void main(String[] args) {
        String email1 = "kata12@gmail.com";
        String email2 = "@outlook.com";

        System.out.println(isGmailOrOutlook(email1));
        System.out.println(isGmailOrOutlook(email2));
    }

    public static boolean isGmailOrOutlook(String email) {
        return Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b").matcher(email).matches();
    }

}
