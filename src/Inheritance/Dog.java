package Inheritance;

public class Dog extends Animal {
  public Dog() {
    super("Mutt", "Big", 50);
  }

  public Dog(String type, double weight) {
    super(type, "Big", weight);
  }

  public void makeNoise() {
    if (type == "Wolf") {
      System.out.print("Woooo!!");
    } else {
      this.bark();
    }

    System.out.println();
  }

  @Override
  public void move(String speed) {
    super.move(speed);

    if (speed == "slow") {
      this.walk();
      this.wagTail();
    } else {
      this.run();
      this.bark();
    }
    System.out.println();
  }

  private void bark() {
    System.out.print("Woof! ");
  }

  private void run() {
    System.out.print("Dog Running! ");
  }

  private void walk() {
    System.out.print("Dog walking! ");
  }

  private void wagTail() {
    System.out.print("Tail Wagging! ");
  }
}
