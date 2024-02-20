import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Film-Database:");
        System.out.println("Indtast navn på film");
        String title = input.next();
        System.out.println("Indtast navn på instruktør");
        String director = input.next();
        System.out.println("Indtast udgivelsesår");
        int year = input.nextInt();
        /*System.out.println("Er filmen i farve?");
        boolean*/
        System.out.println("Filmlængde i min");
        int movieMinuttes = input.nextInt();
        System.out.println("Genre");
        String genre = input.next();
        System.out.println("Film tilføjet: " + title + " Instruktør: " + director +
        " År: " + year + " Varighed: " + movieMinuttes + "minutter Genre: " + genre);

        Movie movie = new Movie(title, director, year, movieMinuttes,genre);
        System.out.println(movie + " Movie er lavet");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.AddMovie(movie);
        movieCollection.getMovies();



    }
}