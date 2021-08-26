package aggregationaccomposition.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {

    private Person owner;
    private BigDecimal balance;

    public BankAccount(Person owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(owner, that.owner) && Objects.equals(balance, that.balance);
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
