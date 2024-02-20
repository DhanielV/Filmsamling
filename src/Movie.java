public class Movie {
   private String title;
   private String director;
   private int year;
   private int movieMinuttes;
   private String genre;
    public Movie(String title, String director, int year, int movieMinuttes, String genre){

        this.title = title;
        this.director = director;
        this.year = year;
        this.movieMinuttes = movieMinuttes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getMovieMinuttes() {
        return movieMinuttes;
    }

    public String getGenre() {
        return genre;
    }
}
