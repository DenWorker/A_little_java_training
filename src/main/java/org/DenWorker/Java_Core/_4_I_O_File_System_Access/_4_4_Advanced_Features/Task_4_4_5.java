package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_4_Advanced_Features;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class Task_4_4_5 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data); ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            int size = objectInputStream.readInt();
            Animal[] result = new Animal[size];
            for (int i = 0; i < size; i++) {
                result[i] = (Animal) objectInputStream.readObject();
            }
            return result;
        } catch (ClassNotFoundException | ArrayIndexOutOfBoundsException | NegativeArraySizeException |
                 ClassCastException | IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
    
    class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
}
