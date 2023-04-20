package solid.interface_sp.before;

public class BFCar implements BFVehicle{

  private final String name;

  private final String brand;

  private final int numberOfTiers;

  private final int numberOfDoors;

  public BFCar(String name, String brand, int numberOfTiers, int numberOfDoors) {
    this.name = name;
    this.brand = brand;
    this.numberOfTiers = numberOfTiers;
    this.numberOfDoors = numberOfDoors;
  }

  public String getName() {
    return name;
  }

  @Override
  public int getNumberOfTiers() {
    return numberOfTiers;
  }

  @Override
  public String getBrandName() {
    return brand;
  }

  @Override
  public int getNumberOfDoors() {
    return numberOfDoors;
  }
}
