package solid.interface_sp.after;

public class AFMotorcycle implements AFVehicle {

  private final String name;

  private final String brand;

  private final int numberOfTiers;

  public AFMotorcycle(String name, String brand, int numberOfTiers) {
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
}
