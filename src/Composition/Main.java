package Composition;

public class Main {
  public static void main(String[] args) {

    ComputerCase theCase = new ComputerCase("Macbook Pro", "Apple", "240");
    Monitor theMonitor = new Monitor("27inch Beast", "Samsung", 27, "2450 x 1440");
    Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 6, 4, "V2.44");

    PersonalComputer thePC = new PersonalComputer("Macbook Pro", "Apple", theCase, theMonitor, theMotherboard);

//    thePC.getMonitor().drawPixelAt(10, 10, "red");
//    thePC.getMotherboard().loadProgram("Mac OS");
//    thePC.getComputerCase().pressPowerButton();
//
    thePC.powerUp();
  }
}
