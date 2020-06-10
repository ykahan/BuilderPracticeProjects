package Robot;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder rb) {
        this.robotBuilder = rb;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildArms();
        this.robotBuilder.buildHead();
        this.robotBuilder.buildLegs();
        this.robotBuilder.buildTorso();
    }
}
