package aggregationaccomposition.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {

    private BigDecimal balance;


    public BankAccount(BigDecimal balance) {
        this.balance = balance;
    }


    public BigDecimal getBalance() {
        return balance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
