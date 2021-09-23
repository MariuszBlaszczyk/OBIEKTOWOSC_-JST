package object.zad2.model;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private Client owner;
    private int yearCreated;

    public BankAccount(String accountNumber, Client owner, int yearCreated) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.yearCreated = yearCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return yearCreated == that.yearCreated && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, owner, yearCreated);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", owner=" + owner +
                ", yearCreated=" + yearCreated +
                '}';
    }
}
