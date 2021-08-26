package aggregationaccomposition.zad1.model;

import java.util.Objects;

public class BankAccount {

    private Person owner;
    private double balance;

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
