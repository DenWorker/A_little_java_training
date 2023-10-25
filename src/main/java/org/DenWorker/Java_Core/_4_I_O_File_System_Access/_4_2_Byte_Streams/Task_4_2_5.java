package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_2_Byte_Streams;

import java.io.IOException;
import java.io.InputStream;

public class Task_4_2_5 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        for (int iterator : inputStream.readAllBytes()) {
            result += iterator;
        }
        return result;
    }
}
