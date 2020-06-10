package Boat;

public class Boat implements BoatPlan{
    private boolean sail;
    private String material;
    private int numCrew;
    private int numPassengers;
    private String flag;

    public boolean hasSail() {
        return sail;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumCrew() {
        return numCrew;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public String getFlag() {
        return flag;
    }

    @Override
    public void setSail(boolean hasSails) {

    }

    @Override
    public void setMaterial(String material) {

    }

    @Override
    public void setCrew(int crew) {

    }

    @Override
    public void setPassengers(int passengers) {

    }

    @Override
    public void setFlag(String flag) {

    }
}
