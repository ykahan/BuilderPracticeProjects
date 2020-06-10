package Robot;

public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder firstRobot = new ModernRobotBuilder();
        RobotEngineer re = new RobotEngineer(firstRobot);
        re.makeRobot();
        Robot robot = re.getRobot();
        System.out.println(robot.getHead());
        System.out.println(robot.getTorso());
        System.out.println(robot.getArms());
        System.out.println(robot.getLegs());
        RobotBuilder secondRobotBuilder = new OldRobotBuilder();
        RobotEngineer newEngineer = new RobotEngineer(secondRobotBuilder);
        newEngineer.makeRobot();
        Robot second = newEngineer.getRobot();
        System.out.println(second.getHead());
    }
}
