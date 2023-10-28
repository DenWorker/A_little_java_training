package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_3_Character_Streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task_4_3_6 {
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[]{48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder();
        int buf;
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset)) {
            while ((buf = inputStreamReader.read()) != -1) {
                result.append((char) buf);
            }
        }
        return result.toString();
    }
}
