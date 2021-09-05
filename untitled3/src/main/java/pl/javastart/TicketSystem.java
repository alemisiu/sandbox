package pl.javastart;

import pl.javastart.Client;
import pl.javastart.MovieShow;
import pl.javastart.model.Ticket;

class TicketSystem {
    Ticket createTicket(MovieShow movieShow, Client client){
        if (movieShow.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
            movieShow.setFreeSeats(movieShow.getFreeSeats() - 1);
            return new Ticket(ticketId, movieShow, client);
        }
    }
}