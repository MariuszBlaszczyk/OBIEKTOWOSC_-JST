package aggregationaccomposition.zad1.model;

import java.util.Objects;

public class Client {

    private Person client;
    private Address registeredAddress;
    private Address residenceAddress;
    private BankAccount bankAccount;
    private Credit credit;


    public Client(Person client, Address registeredAddress, Address residenceAddress, BankAccount bankAccount, Credit credit) {
        this.client = client;
        this.registeredAddress = registeredAddress;
        this.residenceAddress = residenceAddress;
        this.bankAccount = bankAccount;
        this.credit = credit;
    }

    public Client(Person client, Address address, BankAccount bankAccount, Credit credit) {
        this.client = client;
        this.registeredAddress = address;
        this.residenceAddress = address;
        this.bankAccount = bankAccount;
        this.credit = credit;
    }


    public Person getClient() {
        return client;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void getClientDetails() {
        System.out.println("Name: " + getClient().getFirstName() + " " + getClient().getLastName());
        System.out.println("City: " + getResidenceAddress().getCity());
        System.out.println("Balance: " + getBankAccount().getBalance() + "\n");
    }

    ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client1 = (Client) o;
        return Objects.equals(client, client1.client) && Objects.equals(registeredAddress, client1.registeredAddress) && Objects.equals(residenceAddress, client1.residenceAddress) && Objects.equals(bankAccount, client1.bankAccount) && Objects.equals(credit, client1.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, registeredAddress, residenceAddress, bankAccount, credit);
    }

    @Override
    public String toString() {
        return "Client{" +
                "client=" + client +
                ", registeredAddress=" + registeredAddress +
                ", residenceAddress=" + residenceAddress +
                ", bankAccount=" + bankAccount +
                ", credit=" + credit +
                '}';
    }
}
