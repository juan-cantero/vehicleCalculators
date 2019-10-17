package vehicle_cost_calculators_decorators;

import vehicles.Vehicle;

public class CarCostCalculator extends  VehicleCostCalculatorDecorator {


  public CarCostCalculator(Vehicle vehicle) {
    super(vehicle);
  }

  public int fuelCost() {
    return 20 * getVehicle().getKms() + 2 * getVehicle().getWeight();
  }

  public int maintenanceCost() {
    return 3 * getVehicle().getKms() + 3 * getVehicle().getWeight();

  }
}
