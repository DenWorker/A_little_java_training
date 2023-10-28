package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_4_Advanced_Features;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Task_4_4_5 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(3);
        objectOutputStream.writeObject(new Animal("Fox"));
        objectOutputStream.writeObject(new Animal("Wolf"));
        objectOutputStream.writeObject(new Animal("Dog"));
        objectOutputStream.close();
        System.out.println(Arrays.toString(deserializeAnimalArray(byteArrayOutputStream.toByteArray())));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data); ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            Animal[] result = new Animal[objectInputStream.readInt()];
            for (int i = 0; i < result.length; i++) {
                result[i] = (Animal) objectInputStream.readObject();
            }
            return result;
        } catch (ClassNotFoundException | ArrayIndexOutOfBoundsException | NegativeArraySizeException |
                 ClassCastException | IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static class Animal implements Serializable {
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

        @Override
        public String toString() {
            return "Animal{" + "name='" + name + '\'' + '}';
        }
    }
}
