package aggregationaccomposition.zad1.model;

import java.util.Objects;

public class Credit {

    private Person borrower;
    private double cashBorrowed;
    private double cashReturned;
    private double interestRate;
    private int termMonths;

    public Credit(Person borrower, double cashBorrowed, double cashReturned, double interestRate, int termMonths) {
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    public Person getBorrower() {
        return borrower;
    }

    public double getCashBorrowed() {
        return cashBorrowed;
    }

    public double getCashReturned() {
        return cashReturned;
    }

    public double getInterestRate() {
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
        return Double.compare(credit.cashBorrowed, cashBorrowed) == 0 && Double.compare(credit.cashReturned, cashReturned) == 0 && Double.compare(credit.interestRate, interestRate) == 0 && termMonths == credit.termMonths && Objects.equals(borrower, credit.borrower);
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
