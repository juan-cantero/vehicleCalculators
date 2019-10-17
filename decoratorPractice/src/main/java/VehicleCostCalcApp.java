import vehicle_cost_calculators_decorators.BikeCostCalculator;
import vehicle_cost_calculators_decorators.CarCostCalculator;
import vehicle_cost_calculators_decorators.TruckCostCalculator;
import vehicle_cost_calculators_decorators.VehicleCostCalculatorDecorator;
import vehicles.Bike;
import vehicles.Car;
import vehicles.Truck;

public class VehicleCostCalcApp {
  public static void main(String[] args) {
    Car car1 = new Car(300,1000);
    Truck truck1 = new Truck(500, 30000);
    Bike bike1 = new Bike(20,50);

    // calculate car cost
    VehicleCostCalculatorDecorator costCalculator = new CarCostCalculator(car1);
    System.out.println(costCalculator.calculateCosts());

    // calculate truck cost
    VehicleCostCalculatorDecorator costCalculator2 = new TruckCostCalculator(truck1);
    System.out.println(costCalculator2.calculateCosts());

    //calculate bike cost
    VehicleCostCalculatorDecorator costCalculator3 = new BikeCostCalculator(bike1);
    System.out.println(costCalculator3.calculateCosts());  }
}
