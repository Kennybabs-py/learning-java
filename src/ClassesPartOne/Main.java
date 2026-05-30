package ClassesPartOne;

public class Main {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      String name = switch (i) {
        case 1 -> "John";
        case 2 -> "Jane";
        case 3 -> "Janet";
        case 4 -> "Mary";
        case 5 -> "Justin";
        default -> "Anonymous";
      };


      LPAStudent student = new LPAStudent("s90uwu" + i, name,
          "05/04/2005", "Java");
      System.out.println(student);
    }
    System.out.println("\n");

    POJO pojoStudent = new POJO("s90uwu298", "Ann",
        "05/04/2005", "Java");
    LPAStudent recordStudent = new LPAStudent("s90uwu299", "Malcolm",
        "05/04/2006", "Java");

    System.out.println(pojoStudent);
    System.out.println(recordStudent);

    System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
    System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
  }
}
