package vehicle_cost_calculators_decorators;

import vehicles.Vehicle;

public class BikeCostCalculator extends VehicleCostCalculatorDecorator {
  public BikeCostCalculator(Vehicle vehicle) {
    super(vehicle);
  }

  public int fuelCost() {
    return 7 * getVehicle().getKms() + getVehicle().getWeight();
  }

  public int maintenanceCost() {
    return 2 * getVehicle().getKms() * getVehicle().getWeight()/50;
  }
}
