package pl.winiarczyk;

public class MovieFeatures {


    private String title;
    private String directorName;
    private String directorSurname;
    private int movieLength;
    private int productionYear;

    public MovieFeatures(String title, String directorName, String directorSurname,
                         int movieLenght, int productionYear) {

        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.movieLength = movieLenght;
        this.productionYear = productionYear;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public void setDirectorSurname(String directorSurname) {
        this.directorSurname = directorSurname;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
