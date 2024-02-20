public class MovieCollection {
    private Movie[] movies = new Movie[5];
    int currentIndex = 0;
    public Movie[] getMovies(){
        return movies;
    }
    public void AddMovie(Movie movie){
        movies[currentIndex] = movie;
        currentIndex++;


    }
    public udskriv(){
        for(int i < currentIndex; i++){
            System.out.println(movies[i].g);
        }
    }
}
