package solid.interface_sp.after;

import java.util.List;

public class MainISP {

  public static void main(String[] args) {
    AFVehicle motorcycle = new AFMotorcycle("Gt34", "Yamaha", 2);
    AFAutomobile car = new AFCar("c60", "Volvo", 4, 2);

    for (AFVehicle vehicle : List.of(car, motorcycle)) {
      System.out.println(
          "brand:" + vehicle.getBrandName() + ",tiers:" + vehicle.getNumberOfTiers());
    }

    System.out.println("Automobile");
    System.out.println(
        "brand:" + car.getBrandName() + ",tiers:" + car.getNumberOfTiers() + ",doors:"
            + car.getNumberOfDoors());
  }
}
