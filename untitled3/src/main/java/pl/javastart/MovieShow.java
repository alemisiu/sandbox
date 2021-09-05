package pl.javastart;

public class MovieShow {
    private String movieTitle;
    private String movieType;
    private final int movieTime;
    private final int ageRequired;
    private int maxSeats;
    private int freeSeats;

    public MovieShow(String movieTitle, String movieType, int movieTime, int ageRequired, int maxSeats, int freeSeats) {

        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }
    public String getMovieTitle(){
        return movieTitle;
    }
    public void setMovieTitle(String movieTtitle){
        this.movieTitle =movieTitle;
    }
    public String getMovieType(){
        return movieType;
    }
    public void setMovieType(String movieType){
        this.movieType =movieType;
    }
    public int getMovieTime() {
        return this.movieTime;
    }
    public int getAgeRequired(){
        return ageRequired;
    }
    public int getMaxSeats(){
        return maxSeats;
    }
    public void setMaxSeats(int maxSeats){
        this.maxSeats = maxSeats;
    }
    public int getFreeSeats(){
        return freeSeats;
    }
    public void setFreeSeats(int freeSeats){
        this.freeSeats = freeSeats;
    }

}