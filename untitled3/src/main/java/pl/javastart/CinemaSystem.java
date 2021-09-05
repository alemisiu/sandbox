package pl.javastart;

import pl.javastart.model.Ticket;

class CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", true, 20);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client c1 = new Client("Anna", "Zalewska", true,30);
        Ticket ticket2 = ticketSystem.createTicket(movie1, c1);

        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getId()
                    + " | " + ticket1.getClient().getFirstName() + " " + ticket1.getClient().getLastName()
                    + " | " + ticket1.getMovie().getMovieTitle() + " - " + ticket1.getMovie().getMovieType() + " - " + ticket1.getMovie().getMovieTime() + "min");
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getId()
                    + " | " + ticket2.getClient().getFirstName() + " " + ticket2.getClient().getLastName()
                    + " | " + ticket2.getMovie().getMovieTitle() + " - " + ticket2.getMovie().getMovieType() + " - " + ticket2.getMovie().getMovieTime() + "min");
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}