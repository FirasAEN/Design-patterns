package Bridge.MoviePrinter;

import java.util.List;

public interface Formatter {
    public String format(String header, List<String> details);
}
