package Bridge.MoviePrinter;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie instance;
    public MoviePrinter(Movie movie) {
        super();
        this.instance = movie;
    }

    @Override
    protected String getHeader() {
        return this.instance.getTitle();
    }

    @Override
    protected List<String> getDetails() {
        List<String> details = new ArrayList<>();
        details.add(String.valueOf(this.instance.getId()));
        details.add(this.instance.getGenre());
        details.add(String.valueOf(this.instance.getDuration()));
        details.add(this.instance.getReleaseYear());
        return details;
    }
}
