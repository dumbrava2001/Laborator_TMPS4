package solid.interface_sp.after;

public class AFCar implements AFAutomobile{
  private final String name;

  private final String brand;

  private final int numberOfTiers;

  private final int numberOfDoors;

  public AFCar(String name, String brand, int numberOfTiers, int numberOfDoors) {
    this.name = name;
    this.brand = brand;
    this.numberOfTiers = numberOfTiers;
    this.numberOfDoors = numberOfDoors;
  }

  public String getName() {
    return name;
  }

  @Override
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  @Override
  public int getNumberOfTiers() {
    return numberOfTiers;
  }

  @Override
  public String getBrandName() {
    return brand;
  }
}
