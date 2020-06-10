package Robot;

public class ModernRobotBuilder implements RobotBuilder{
    private Robot robot;

    public ModernRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setRobotHead("Graphene Head");
    }

    @Override
    public void buildTorso() {
        robot.setRobotTorso("Holographic Torso");
    }

    @Override
    public void buildArms() {
        robot.setRobotArms("Smart Arms");
    }

    @Override
    public void buildLegs() {
        robot.setRobotLegs("Lizard Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
