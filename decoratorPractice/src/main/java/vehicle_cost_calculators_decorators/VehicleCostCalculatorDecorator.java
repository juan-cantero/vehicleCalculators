package vehicle_cost_calculators_decorators;

import vehicles.Vehicle;

public abstract class VehicleCostCalculatorDecorator implements VehicleCostCalculator {
  private Vehicle vehicle;

  public VehicleCostCalculatorDecorator(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public int calculateCosts() {
    return fuelCost() + maintenanceCost() + driverCost();
  }

  public abstract int fuelCost();


  public abstract int maintenanceCost() ;


  public  int driverCost() {
    return 30 *  getVehicle().getKms();
  };
}
