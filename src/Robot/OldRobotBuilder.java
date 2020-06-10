package Robot;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

    @Override
    public void buildHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildTorso() {
        robot.setRobotTorso("Copper Torso");
    }

    @Override
    public void buildArms() {
        robot.setRobotArms("Unjointed Arms");
    }

    @Override
    public void buildLegs() {
        robot.setRobotLegs("Rubber Legs");
    }
}
