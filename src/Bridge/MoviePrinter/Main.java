package Bridge.MoviePrinter;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("A new movie");
        movie.setGenre("thriller");
        movie.setReleaseYear("2020");
        movie.setDuration(180);

        String out;
        Printer moviePrinter = new MoviePrinter(movie);
        Formatter dummyFormatter = new DummyFormatter();
        out = moviePrinter.print(dummyFormatter);
        System.out.println(out);

        Formatter webFormatter = new WebFormatter();
        out = moviePrinter.print(webFormatter);
        System.out.println(out);
    }
}