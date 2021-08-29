package pl.winiarczyk;

public class Movie {
    public static void main(String[] args) {

       MovieFeatures actionMovie = new MovieFeatures("Rambo 7", "Janusz ", "Debeściak",
               199, 2021);

        System.out.println("Today movie is: " + actionMovie.getTitle());
        System.out.println("Made by: " + actionMovie.getDirectorName() + actionMovie.getDirectorSurname());
        System.out.println("The movie is " + actionMovie.getMovieLength() + " minutes long!");
        System.out.println("Produced in " + actionMovie.getProductionYear() );
    }
}
