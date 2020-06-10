package Robot;

public class Robot implements RobotPlan{
    private String Head;
    private String Torso;
    private String Arms;
    private String Legs;

    public String getHead() {
        return Head;
    }

    public String getTorso() {
        return Torso;
    }

    public String getArms() {
        return Arms;
    }

    public String getLegs() {
        return Legs;
    }

    @Override
    public void setRobotHead(String type) {
        this.Head = type;
    }

    @Override
    public void setRobotTorso(String type) {
        this.Torso = type;
    }

    @Override
    public void setRobotArms(String type) {
        this.Arms = type;
    }

    @Override
    public void setRobotLegs(String type) {
        this.Legs = type;
    }
}
