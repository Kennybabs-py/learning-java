package Polymorphism;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter A for Adventure Movies, C for " +
          "Comedy Movies, S fiction for Science Fiction Movies or Q to quit: ");
      String type = scanner.nextLine();

      if ("Qq".contains(type)) break;

      System.out.println("Enter title of movie: ");
      String title = scanner.nextLine();

      Movie theMovie = Movie.getMovie(title, type);
      theMovie.watchMovie();
    }
  }
}
