package Bridge.MoviePrinter;

import java.util.List;

public class WebFormatter implements Formatter {
    @Override
    public String format(String header, List<String> details) {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");
        sb.append(header);
        sb.append("</span>");
        for (String detail: details) {
            sb.append("\n");
            sb.append("<span>");
            sb.append(detail);
            sb.append("</span>");
            sb.append("\n");
        }
        return sb.toString();
    }
}
