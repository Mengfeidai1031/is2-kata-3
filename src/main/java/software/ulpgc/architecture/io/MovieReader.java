package software.ulpgc.architecture.io;

import software.ulpgc.architecture.model.Movie;
import java.util.List;

public interface MovieReader {
    List<Movie> read();
}
