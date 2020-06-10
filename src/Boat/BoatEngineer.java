package Boat;

public class BoatEngineer {
    private BoatBuilder boatBuilder;

    public BoatEngineer(BoatBuilder boatBuilder) {
        this.boatBuilder = boatBuilder;
    }

    public Boat getBoat(){
        return this.boatBuilder.getBoat();
    }

    // still in the middle of this class
}
