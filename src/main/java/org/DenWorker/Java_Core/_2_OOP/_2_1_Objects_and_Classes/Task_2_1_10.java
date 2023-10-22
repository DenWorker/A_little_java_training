package org.DenWorker.Java_Core._2_OOP._2_1_Objects_and_Classes;

public class Task_2_1_10 {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(10, 5);
        ComplexNumber complexNumber2 = new ComplexNumber(10, 5);
        System.out.println(complexNumber1.hashCode());

        System.out.println(complexNumber1.equals(complexNumber2));
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result * 31 + (int) this.re;
            result = result * 31 + (int) this.im;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            ComplexNumber complexNumber = (ComplexNumber) obj;
            return this.re == complexNumber.re && this.im == complexNumber.im;
        }
    }

}
