package StringFormatting;

public class Main {
  public static void main(String[] args) {
    String bulletIt = "Print a bulleted list\n" +
        "\t\u2022 First point\n" +
        "\t\t\u2022 Second point\n" +
        "\t\t\t\u2022 Third point";


    // Using text blocks
    String textBlock = """
        \u2022 First point
          \u2022 Second point
            \u2022 Third point
        """;

    System.out.println(bulletIt);
    System.out.println(textBlock);

    int age = 500;
    int year = 1289;
    System.out.printf("Age is %d, and year is %d.%n", age, year);

    double variant = 32.09426;
    System.out.printf("Variant is %.3f %n", variant);


//    Number width formatting

    for (int i = 1; i <= 10000; i *= 10) {
      System.out.printf("Number is %5d %n", i);
    }

    String formattedString = String.format("Age is %d %n", age);
    formattedString = "New age is %d".formatted(40);
    System.out.println(formattedString);
  }
}
