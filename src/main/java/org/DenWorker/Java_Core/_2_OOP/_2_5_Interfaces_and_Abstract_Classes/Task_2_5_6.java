package org.DenWorker.Java_Core._2_OOP._2_5_Interfaces_and_Abstract_Classes;

public class Task_2_5_6 {
    public static void main(String[] args) {
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[]{68, 69, 78, 79, 79, 79});

        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence);
        System.out.println(asciiCharSequence.subSequence(3, 5));
    }

    public static class AsciiCharSequence implements CharSequence {
        private final byte[] charSequence;

        public AsciiCharSequence(byte[] charSequence) {
            this.charSequence = charSequence;
        }

        @Override
        public int length() {
            return charSequence.length;
        }

        @Override
        public char charAt(int index) {
            return (char) this.charSequence[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] resultSubArray = new byte[end - start];
            System.arraycopy(this.charSequence, start, resultSubArray, 0, end - start);
            return new AsciiCharSequence(resultSubArray);
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            for (byte iterator : this.charSequence) {
                result.append((char) iterator);
            }
            return result.toString();
        }
    }
}
