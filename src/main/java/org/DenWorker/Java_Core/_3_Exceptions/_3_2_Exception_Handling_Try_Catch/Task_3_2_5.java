package org.DenWorker.Java_Core._3_Exceptions._3_2_Exception_Handling_Try_Catch;

public class Task_3_2_5 {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException ignored) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static class Car implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
    }
}
