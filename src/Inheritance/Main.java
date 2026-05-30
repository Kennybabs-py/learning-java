package Inheritance;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "slow");

    Dog wolf = new Dog("Wolf", 40);
    doAnimalStuff(wolf, "slow");

    Fish tilapia = new Fish("Tilapia", 40, 20, 10);
    doAnimalStuff(tilapia, "fast");
  }

  public static void doAnimalStuff(Animal animal, String speed) {
    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);
    System.out.println(animal.hashCode());
    System.out.println("_________");
  }
}