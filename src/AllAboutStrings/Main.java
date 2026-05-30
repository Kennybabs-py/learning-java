package AllAboutStrings;

public class Main {
  public static void main(String[] args) {
    printInformation("Hello World");
  }

  public static void printInformation(String string) {
    int length = string.length();
    char firstChar = string.charAt(0);
    char lastChar = string.charAt(length - 1);
    System.out.printf("Length of string is: %d %n", length);
    System.out.printf("First char is: is %c %n", firstChar);
    System.out.printf("Last char is: is %c %n", lastChar);

  }
}
