package encapsulation.zad2.service;


import encapsulation.zad2.model.Client;
import encapsulation.zad2.model.Screening;
import encapsulation.zad2.model.Ticket;

public class TicketService {

    public Ticket createTicket(Screening screening, Client client) {
        if (screening.hasFreeSeats()) {
            throw new IllegalArgumentException("No seats available for the screening");
        } else if (isClientPermitted(client, screening)) {
            throw new IllegalArgumentException("Video available for people above " +
                    screening.getAgeRequired() + " years.");
        } else {
            int ticketId = screening.calculateIdNumber();
            screening.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, screening, client);
        }
    }

    private boolean isClientPermitted(Client client, Screening screening) {
        return (client.age() < screening.getAgeRequired().getDescription());
    }


}
