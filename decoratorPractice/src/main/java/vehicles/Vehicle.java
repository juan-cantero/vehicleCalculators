package vehicles;

public abstract class Vehicle {
  private int kms;
  private int weight;

  public Vehicle( int kms, int weight) {
    this.kms = kms;
    this.weight = weight;
  }

  public int getKms() {
    return kms;
  }

  public int getWeight() {
    return weight;
  }
}
