package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_2_Byte_Streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task_4_2_5 {
    public static void main(String[] args) throws IOException {
        byte[] original = {1, -2, -3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(original);
        int ans = new Task_4_2_5().sumOfStream(inputStream);
        System.out.println(ans);
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int buf;
        while ((buf = inputStream.read()) != -1) {
            result += (byte) buf;
        }
        return result;
    }
}
