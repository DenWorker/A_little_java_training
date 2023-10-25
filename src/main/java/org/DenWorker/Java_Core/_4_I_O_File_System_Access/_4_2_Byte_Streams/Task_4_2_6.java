package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_2_Byte_Streams;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task_4_2_6 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        for (byte iterator : inputStream.readAllBytes()) {
            if (iterator % 2 == 0) {
                outputStream.write(iterator);
            }
        }
        outputStream.flush();
    }
}
