package encapsulation.zad2.model;

import java.util.Objects;

public class Ticket {

    private int id;
    private Screening screening;
    private Client client;

    public Ticket(int id, Screening screening, Client client) {
        this.id = id;
        this.screening = screening;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return id + " | " + client.getFullName() + " | " + screening.getMovieDetails();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && Objects.equals(screening, ticket.screening) && Objects.equals(client, ticket.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, screening, client);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", screening=" + screening +
                ", client=" + client +
                '}';
    }
}
