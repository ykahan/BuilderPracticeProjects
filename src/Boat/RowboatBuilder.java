package Boat;

public class RowboatBuilder implements BoatBuilder{
    Boat boat;

    public RowboatBuilder() {
        this.boat = new Boat();
    }

    @Override
    public void buildSail(boolean shouldHaveSail) {
        boat.setSail(shouldHaveSail);
    }

    public void buildSail(){
        boat.setSail(false);
    }

    @Override
    public void buildMaterial(String material) {
        boat.setMaterial(material);
    }

    public void buildMaterial(){
        boat.setMaterial("Wood");
    }

    @Override
    public void buildCrew(int crew) {
        if(crew < 0) boat.setCrew(2);
        else boat.setCrew(crew);
    }

    public void buildCrew(){
        boat.setCrew(2);
    }

    @Override
    public void buildPassengers(int passengers) {
        if(passengers < 0) boat.setPassengers(0);
        else boat.setPassengers(passengers);
    }

    public void buildPassengers(){
        boat.setPassengers(0);
    }

    @Override
    public void buildFlag(String flag) {
        boat.setFlag(flag);
    }

    public void buildFlad(){
        boat.setFlag("no flag");
    }

    @Override
    public Boat getBoat() {
        return boat;
    }
}
