package solid.interface_sp.before;

import java.util.List;

public class BFMainISP {

  public static void main(String[] args) {
    BFVehicle motorcycle = new BFMotorcycle("Gt34", "Yamaha", 2);
    BFVehicle car = new BFCar("c60", "Volvo", 4, 2);

    for (BFVehicle vehicle : List.of(car, motorcycle)) {
      System.out.println(
          "brand:" + vehicle.getBrandName() + ",tiers:" + vehicle.getNumberOfTiers() + ",doors:"
              + vehicle.getNumberOfDoors());
    }
  }
}
