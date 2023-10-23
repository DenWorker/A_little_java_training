package org.DenWorker.Java_Core._3_Exceptions._3_1_Getting_to_Know_the_Exceptions;

public class Task_3_1_5 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    class MyNewException extends Exception {

    }

}
