import java.time.Duration;

public class Movie {
    private String title;
    private String director;
    private Duration duration;

    public Movie(String title, String director, Duration duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
}
