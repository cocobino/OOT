import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public LocalDateTime getWhenScreened() {
        return this.whenScreened;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }

    public Screening movie(Movie movie) {
        this.movie = movie;
        return this;
    }

    public Screening sequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public Screening whenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
        return this;
    }
}