package encapsulation.zad2.service;


import encapsulation.zad2.model.Client;
import encapsulation.zad2.model.Screening;
import encapsulation.zad2.model.Ticket;

import java.util.Optional;

public class TicketService {

    public Optional<Ticket> createTicket(Screening screening, Client client) {
        if (screening.hasFreeSeats()) {
            throw new IllegalArgumentException("No seats available for the screening");
        } else if (isClientPermitted(client, screening)) {
            return Optional.empty();
        } else {
            int ticketId = screening.calculateIdNumber();
            screening.decreaseFreeSeatsNumber();
            return Optional.of(new Ticket(ticketId, screening, client));
        }
    }

    private boolean isClientPermitted(Client client, Screening screening) {
        return (client.age() < screening.getAgeRequired().getDescription());
    }


}
