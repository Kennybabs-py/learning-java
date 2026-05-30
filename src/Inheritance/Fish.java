package Inheritance;

public class Fish extends Animal {
  private int fins;
  private int gills;

  public Fish(String type, double weight, int fins, int gills) {
    super(type, "small", weight);
    this.fins = fins;
    this.gills = gills;
  }

  private void moveMuscles() {
    System.out.println("Moving muscles");
  }

  private void moveBackfin() {
    System.out.println("Moving back fin");
  }

  @Override
  public void move(String speed) {
    super.move(speed);
    this.moveMuscles();
    if (speed == "fast") {
      this.moveBackfin();
    }
    System.out.println();
  }

  @Override
  public String toString() {
    return "Fish{" +
        "fins=" + fins +
        ", gills=" + gills + super.toString() +
        '}';
  }
}
