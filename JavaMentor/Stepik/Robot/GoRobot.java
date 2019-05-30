package JavaMentor.Stepik.Robot;

import JavaMentor.Stepik.Robot.Robot.Direction;

public class GoRobot {
    public static void main(String[] args) {

    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        Direction DirectionX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction DirectionY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != DirectionX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != DirectionY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
