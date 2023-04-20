package solid.interface_sp.before;

public class BFMotorcycle implements BFVehicle{

  private final String name;

  private final String brand;

  private final int numberOfTiers;

  public BFMotorcycle(String name, String brand, int numberOfTiers) {
    this.name = name;
    this.brand = brand;
    this.numberOfTiers = numberOfTiers;
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
    throw new IllegalStateException("No doors for motorcycle!");
  }
}
