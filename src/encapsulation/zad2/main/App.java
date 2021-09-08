package encapsulation.zad2.main;

import encapsulation.zad2.model.AgeRequired;
import encapsulation.zad2.model.Client;
import encapsulation.zad2.model.Screening;
import encapsulation.zad2.model.Ticket;
import encapsulation.zad2.service.TicketService;

public class App {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();
        Screening screening1 = new Screening("Omen", "horror", 128, AgeRequired.SIXTEEN,
                72, 72);

        Client client1 = new Client("Jan", "Kowalski", 15);
        Ticket ticket1 = ticketService.createTicket(screening1, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketService.createTicket(screening1, client2);

        System.out.println("Sold out tickets");
        if (ticket1.getId() != 0) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2.getId() != 0) {
            System.out.println(ticket2.getInfo());
        }

        screening1.freeSeatsInfo();
        screening1.ticketsSoldInfo();
    }
}
