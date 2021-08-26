package classobjects.zad1.model;

import java.math.BigDecimal;

public enum Seniority {

    JUNIOR(new BigDecimal("5000")), MID(new BigDecimal("10000")), SENIOR(new BigDecimal("15000"));

    private final BigDecimal salaryLevel;

    Seniority(BigDecimal salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public BigDecimal getSalaryLevel() {
        return salaryLevel;
    }
}
