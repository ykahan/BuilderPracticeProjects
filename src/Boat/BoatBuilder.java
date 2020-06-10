package Boat;

public interface BoatBuilder {
    public void buildSail(boolean shouldHaveSail);
    public void buildMaterial(String material);
    public void buildCrew(int crew);
    public void buildPassengers(int passengers);
    public void buildFlag(String flag);
    public Boat getBoat();
}
