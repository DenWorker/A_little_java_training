package org.DenWorker.Java_Core._3_Exceptions._3_2_Exception_Handling_Try_Catch;

public class Task_3_2_4 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException e) {
            return false;
        }
    }

    interface BankWorker {
        boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
    }

    public static class BankClient {

    }

    static class BadCreditHistoryException extends Exception {

    }

    static class ProblemWithLawException extends Exception {

    }

}
