package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_4_Advanced_Features;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_4_4_8 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
    }
}
