package vehicle_cost_calculators_decorators;

import vehicles.Vehicle;

public class TruckCostCalculator extends VehicleCostCalculatorDecorator {
  public TruckCostCalculator(Vehicle vehicle) {
    super(vehicle);
  }

  public int fuelCost() {
    return 10 * getVehicle().getKms() + 3 * getVehicle().getWeight();
  }

  public int maintenanceCost() {
    return 30 * getVehicle().getKms();

  }
}
