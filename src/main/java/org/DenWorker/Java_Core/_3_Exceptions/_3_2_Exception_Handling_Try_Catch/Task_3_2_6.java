package org.DenWorker.Java_Core._3_Exceptions._3_2_Exception_Handling_Try_Catch;

public class Task_3_2_6 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try {
                RobotConnection robotConnection = robotConnectionManager.getConnection();
                try {
                    robotConnection.moveRobotTo(toX, toY);
                    return;
                } catch (RobotConnectionException ignored) {
                    robotConnection.close();
                } finally {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException ignored) {
                    }
                }
            } catch (RobotConnectionException ignored) {
                if (i == 2) {
                    throw new RobotConnectionException("");
                }
            }
        }
    }
    
    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
