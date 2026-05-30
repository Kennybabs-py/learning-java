public class TheStringBuilder {
  public static void main(String[] args) {
    String helloWorld = "Hello" + " World";
    helloWorld.concat(" and Goodbye");

    StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
    helloWorldBuilder.append(" and Goodbye");

    printInformation(helloWorld);
    printInformation(helloWorldBuilder);
    System.out.println("-".repeat(40));

    StringBuilder emptyStart = new StringBuilder();
    emptyStart.append("a".repeat(17));
    StringBuilder emptyStart32 = new StringBuilder(32);
    emptyStart32.append("a".repeat(17));

    printInformation(emptyStart);
    printInformation(emptyStart32);
    System.out.println("-".repeat(40));


    StringBuilder builderPlus = new StringBuilder("Hello World, and Goodbye.");
    builderPlus.append(" See you again");
    builderPlus.deleteCharAt(10);
    builderPlus.insert(10, 'd');
    builderPlus.reverse();

    printInformation(builderPlus);
    System.out.println("-".repeat(40));

  }

  public static void printInformation(String string) {
    System.out.println("String is " + string);
    System.out.println("String length is " + string.length());
  }

  public static void printInformation(StringBuilder builder) {
    System.out.println("StringBuilder is " + builder);
    System.out.println("StringBuilder length is " + builder.length());
    System.out.println("StringBuilder capacity is " + builder.capacity());
  }
}
