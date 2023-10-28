package org.DenWorker.Java_Core._5_Generics_Collections._5_1_Generics;

import java.util.Arrays;

public class Task_5_1_15 {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(14);

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.get(3));
        //System.out.println(dynamicArray.get(300));

        dynamicArray.remove(0);
        System.out.println(dynamicArray);

        dynamicArray.remove(3);
        System.out.println(dynamicArray);

    }

    public static class DynamicArray<T> {
        private int size = 0;
        private T[] dynamicArray = (T[]) new Object[5];

        public DynamicArray() {
        }

        public int getSize() {
            return this.size;
        }

        public void add(T el) {
            if (size == this.dynamicArray.length) {
                this.dynamicArray = Arrays.copyOf(this.dynamicArray, this.dynamicArray.length + 5);
            }
            this.dynamicArray[size++] = el;
        }

        public void remove(int index) {
            if (index >= this.size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.arraycopy(this.dynamicArray, index + 1, this.dynamicArray, index, this.dynamicArray.length - index - 1);
            this.size--;
        }

        public T get(int index) {
            if (index >= this.size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return this.dynamicArray[index];
        }

        @Override
        public String toString() {
            StringBuilder strArray = new StringBuilder().append("[");
            for (int i = 0; i < size; i++) {
                strArray.append(this.dynamicArray[i]).append(", ");
            }
            return strArray.delete(strArray.length() - 2, strArray.length()).append("]").toString();
        }
    }

}
