package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_3_Character_Streams;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task_4_3_6 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        return new String(inputStream.readAllBytes(), charset);
    }
}
