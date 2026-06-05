package Polymorphism;

public class NextMain {
  public static void main(String[] args) {
    Movie theMovie = Movie.getMovie("A", "Jaws");
    theMovie.watchMovie();

    Adventure adventure = (Adventure) Movie.getMovie("A", "Jaws");
    adventure.watchMovie();

    Object comedy = Movie.getMovie("C", "Ride Along");
    Comedy comedyMovie = (Comedy) comedy;
    comedyMovie.watchComedy();

    var airplane = Movie.getMovie("A", "Airplane");
    airplane.watchMovie();

    var plane = new Comedy("Plane");
    plane.watchComedy();

    Object unknownObject = Movie.getMovie("A", "Airplane");

    if (unknownObject.getClass().getSimpleName() == "Comedy") {
      Comedy c = (Comedy) unknownObject;
      c.watchComedy();
    } else if (unknownObject instanceof Adventure) {
      ((Adventure) unknownObject).watchAdventure();
    } else if (unknownObject instanceof ScienceFiction syfy) {
      syfy.watchScienceFiction();
    }

  }

}
