package Polymorphism;

public class Movie {
  private String title;

  public Movie(String title) {
    this.title = title;
  }

  public static Movie getMovie(String title, String type) {
    return switch (type.toUpperCase().charAt(0)) {
      case 'A' -> new Adventure(title);
      case 'C' -> new Comedy(title);
      case 'S' -> new ScienceFiction(title);
      default -> new Movie(title);
    };
  }

  public void watchMovie() {
    // This gets the name of the class
    String instanceType = this.getClass().getSimpleName();
    System.out.println(title + " is a " + instanceType + " film");
  }
}


class Adventure extends Movie {
  public Adventure(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf("...%s%n".repeat(3), "Pleasant Scene", "Scary Movie", "Something bad happens");
  }

  public void watchAdventure() {
    System.out.println("Watching adventure");
  }
}

class Comedy extends Movie {
  public Comedy(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf("...%s%n".repeat(3), "" +
        "Funny", "Funnier", "Happy ending");
  }

  public void watchComedy() {
    System.out.println("Watching comedy");
  }

}


class ScienceFiction extends Movie {
  public ScienceFiction(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf("...%s%n".repeat(3), "" +
        "Aliens arrive", "War with aliens", "Planet damnation");
  }

  public void watchScienceFiction() {
    System.out.println("Watching sci-fi");
  }
}
