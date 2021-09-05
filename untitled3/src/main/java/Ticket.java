package pl.javastart.model;

import pl.javastart.Client;
import pl.javastart.MovieShow;

public class Ticket {
    private int id;
    private MovieShow movie;
    private Client client;

    public Ticket(int id, MovieShow movie, Client client) {
        this.id = id;
        this.movie = movie;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MovieShow getMovie() {
        return movie;
    }

    public void setMovie(MovieShow movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}