package aggregationaccomposition.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Credit {

    private Person borrower;
    private BigDecimal cashBorrowed;
    private BigDecimal cashReturned;
    private BigDecimal interestRate;
    private int termMonths;

    public Credit(Person borrower, BigDecimal cashBorrowed, BigDecimal cashReturned, BigDecimal interestRate, int termMonths) {
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    public Person getBorrower() {
        return borrower;
    }

    public BigDecimal getCashBorrowed() {
        return cashBorrowed;
    }

    public BigDecimal getCashReturned() {
        return cashReturned;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return termMonths == credit.termMonths && Objects.equals(borrower, credit.borrower) && Objects.equals(cashBorrowed, credit.cashBorrowed) && Objects.equals(cashReturned, credit.cashReturned) && Objects.equals(interestRate, credit.interestRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(borrower, cashBorrowed, cashReturned, interestRate, termMonths);
    }

    @Override
    public String toString() {
        return "Credit{" +
                "borrower=" + borrower +
                ", cashBorrowed=" + cashBorrowed +
                ", cashReturned=" + cashReturned +
                ", interestRate=" + interestRate +
                ", termMonths=" + termMonths +
                '}';
    }
}
