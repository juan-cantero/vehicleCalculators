package vehicle_cost_calculators_decorators;

public interface VehicleCostCalculator {
  int calculateCosts();
  int fuelCost();
  int maintenanceCost();
  int driverCost();
}
