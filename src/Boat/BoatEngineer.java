package Boat;

public class BoatEngineer {
    private BoatBuilder boatBuilder;

    public BoatEngineer(BoatBuilder boatBuilder) {
        this.boatBuilder = boatBuilder;
    }

    public Boat getBoat(){
        return this.boatBuilder.getBoat();
    }
}
