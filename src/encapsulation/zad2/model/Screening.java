package encapsulation.zad2.model;

import java.util.Objects;

public class Screening {

    private String movieTitle;
    private String movieType;
    private int movieTime;
    private AgeRequired ageRequired;
    private int maxSeats;
    private int freeSeats;

    public Screening(String movieTitle, String movieType, int movieTime, AgeRequired ageRequired, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public AgeRequired getAgeRequired() {
        return ageRequired;
    }

    public String getMovieDetails() {
        return movieTitle + " - " + movieType + " " + movieTime + " min.";
    }

    public void freeSeatsInfo() {
        System.out.println("Number of seats remaining:  " + getFreeSeats());
    }

    public void ticketsSoldInfo() {
        System.out.println("Number of tickets sold:  " + (getMaxSeats() - getFreeSeats()));
    }

    public boolean hasFreeSeats() {
        return freeSeats == 0;
    }

    public int calculateIdNumber() {
        return maxSeats - freeSeats + 1;
    }

    public void decreaseFreeSeatsNumber() {
        freeSeats--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screening movieSeans = (Screening) o;
        return movieTime == movieSeans.movieTime && ageRequired == movieSeans.ageRequired && maxSeats == movieSeans.maxSeats && freeSeats == movieSeans.freeSeats && Objects.equals(movieTitle, movieSeans.movieTitle) && Objects.equals(movieType, movieSeans.movieType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieTitle, movieType, movieTime, ageRequired, maxSeats, freeSeats);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", movieType='" + movieType + '\'' +
                ", movieTime=" + movieTime +
                ", ageRequired=" + ageRequired +
                ", maxSeats=" + maxSeats +
                ", freeSeats=" + freeSeats +
                '}';
    }
}
