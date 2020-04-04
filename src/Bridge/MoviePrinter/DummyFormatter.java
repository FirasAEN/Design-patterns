package Bridge.MoviePrinter;

import java.util.List;

public class DummyFormatter implements Formatter {
    @Override
    public String format(String header, List<String> details) {
        StringBuilder sb = new StringBuilder();
        sb.append(header);
        sb.append("\n");
        for (String detail: details) {
            sb.append("-----");
            sb.append("\n");
            sb.append(detail);
            sb.append("\n");
        }
        return sb.toString();
    }
}
