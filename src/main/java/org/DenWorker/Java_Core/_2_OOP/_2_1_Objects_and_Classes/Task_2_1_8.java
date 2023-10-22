package org.DenWorker.Java_Core._2_OOP._2_1_Objects_and_Classes;

public class Task_2_1_8 {
    public static void main(String[] args) {
        Robot robot = new Robot(3, -3, Direction.LEFT);
        System.out.println("X:" + robot.getX() + "  Y:" + robot.getY() + "  Direction:" + robot.getDirection());
        System.out.println();


        moveRobot(robot, 10, 12);
        System.out.println("After move:");
        System.out.println("X:" + robot.getX() + "  Y:" + robot.getY() + "  Direction:" + robot.getDirection());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case RIGHT -> {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                case UP -> robot.turnLeft();
                case DOWN -> robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

            if (robot.getY() > toY) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() < toY) {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case LEFT -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case UP -> robot.turnRight();
                case DOWN -> robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

            if (robot.getY() < toY) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() > toY) {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }

    public static class Robot {

        private int x;
        private int y;
        private Direction direction;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return this.direction;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void turnLeft() {
            this.direction = switch (this.direction) {
                case UP -> Direction.LEFT;
                case LEFT -> Direction.DOWN;
                case DOWN -> Direction.RIGHT;
                case RIGHT -> Direction.UP;
            };
        }

        public void turnRight() {
            this.direction = switch (this.direction) {
                case UP -> Direction.RIGHT;
                case RIGHT -> Direction.DOWN;
                case DOWN -> Direction.LEFT;
                case LEFT -> Direction.UP;
            };
        }

        public void stepForward() {
            switch (this.direction) {
                case UP -> this.y++;
                case DOWN -> this.y--;
                case RIGHT -> this.x++;
                case LEFT -> this.x--;
            }
        }
    }
}
