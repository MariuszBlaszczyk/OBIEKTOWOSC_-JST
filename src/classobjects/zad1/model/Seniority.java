package classobjects.zad1.model;

import java.math.BigDecimal;

public enum Seniority {

    JUNIOR(" and its payment is 5000 PLN"),
    MID(" and its payment is 10000 PLN"),
    SENIOR(" and its payment is 15000 PLN");

    private final String salaryLevel;

    Seniority(String salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getSalaryLevel() {
        return salaryLevel;
    }
}
