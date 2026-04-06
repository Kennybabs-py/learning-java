package ClassesPartOne;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setMake("Porsche");
    car.setModel("Carrera");
    car.setDoors(4);
    car.setConvertible(false);
    car.setColor("Black");

    System.out.println("Car make is " + car.getMake());
    System.out.println("Car color is " + car.getColor());
    System.out.println("Number of car doors is " + car.getDoors());
    System.out.println("Car convertible status: " + car.isConvertible());

    car.describeCar();
  }
}
